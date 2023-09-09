package ex_5_6;

public enum Symbol {
    OPEN_CURLY("{"),
    CLOSE_CURLY("}"),
    OPEN_SQUARE("["),
    CLOSE_SQUARE("]"),
    OPEN_PAREN("("),
    CLOSE_PAREN(")");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isOpeningSymbol() {
        return this == OPEN_CURLY || this == OPEN_SQUARE || this == OPEN_PAREN;
    }

    public boolean isClosingSymbol() {
        return this == CLOSE_CURLY || this == CLOSE_SQUARE || this == CLOSE_PAREN;
    }

    public static Symbol fromString(String symbolStr) {
        for (Symbol symbol : Symbol.values()) {
            if (symbol.getSymbol().equals(symbolStr)) {
                return symbol;
            }
        }
        return null; // Symbol not found
    }

    public Symbol getMatchingOpeningSymbol() {
        return switch (this) {
            case CLOSE_CURLY -> OPEN_CURLY;
            case CLOSE_SQUARE -> OPEN_SQUARE;
            case CLOSE_PAREN -> OPEN_PAREN;
            default -> null; // Not a closing symbol
        };
    }
}
