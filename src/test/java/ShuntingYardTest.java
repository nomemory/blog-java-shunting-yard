import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static net.andreinc.shunting.yard.ShuntingYard.shuntingYard;
import static org.assertj.core.api.Assertions.assertThat;

public class ShuntingYardTest {

    @Test
    public void test1() {

        List<String> given = Arrays.asList("( 1 + 2 ) * ( 3 / 4 ) ^ ( 5 + 6 )".split(" "));
        List<String> expected = List.of("1", "2", "+", "3", "4", "/", "5", "6", "+", "^", "*");
        List<String> computed = shuntingYard(given);

        System.out.println("infix:" + given);
        System.out.println("rpn (expected):" + expected);
        System.out.println("rpn (computed):" + computed);

        assertThat(computed).isEqualTo(expected);
    }

    @Test
    public void test2() {
        List<String> given = Arrays.asList("A ^ 2 + 2 * A * B + B ^ 2".split(" "));
        List<String> expected = List.of("A", "2", "^", "2", "A", "*", "B", "*", "+", "B", "2", "^", "+");
        List<String> computed = shuntingYard(given);

        System.out.println("infix:" + given);
        System.out.println("rpn (expected):" + expected);
        System.out.println("rpn (computed):" + computed);

        assertThat(computed).isEqualTo(expected);
    }
}
