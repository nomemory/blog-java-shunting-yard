package net.andreinc.shunting.yard;

public enum Operator implements Comparable<Operator> {

    ADDITION("+", Associativity.LEFT, 0),
    SUBTRACTION("-", Associativity.RIGHT, 0),
    DIVISION("/", Associativity.LEFT, 5),
    MULTIPLICATION("*", Associativity.LEFT, 5),
    MODULUS("%", Associativity.LEFT, 5),
    POWER("^", Associativity.RIGHT, 10);

    final Associativity associativity;
    final int precedence;
    final String symbol;

    Operator(String symbol, Associativity associativity, int precedence) {
        this.symbol = symbol;
        this.associativity = associativity;
        this.precedence = precedence;
    }

    public int comparePrecedence(Operator operator) {
        return this.precedence - operator.precedence;
    }
}


