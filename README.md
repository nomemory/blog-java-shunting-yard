`"Academic"` implementation for the [Shunting Yard Algorithm](https://en.wikipedia.org/wiki/Shunting-yard_algorithm?oldformat=true) in Java.

Usage:

```java
List<String> given = Arrays.asList("( 1 + 2 ) * ( 3 / 4 ) ^ ( 5 + 6 )".split(" "));
List<String> expected = List.of("1", "2", "+", "3", "4", "/", "5", "6", "+", "^", "*");
List<String> computed = shuntingYard(given);

System.out.println("infix:" + given);
System.out.println("rpn (expected):" + expected);
System.out.println("rpn (computed):" + computed);

assertThat(computed).isEqualTo(expected);
```

Output:

```
infix:[(, 1, +, 2, ), *, (, 3, /, 4, ), ^, (, 5, +, 6, )]
rpn (expected):[1, 2, +, 3, 4, /, 5, 6, +, ^, *]
rpn (computed):[1, 2, +, 3, 4, /, 5, 6, +, ^, *]
```
