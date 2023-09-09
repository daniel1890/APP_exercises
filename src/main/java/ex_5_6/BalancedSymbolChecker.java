package ex_5_6;

import ex_5_4.HanStack;

public class BalancedSymbolChecker<AnyType> {
    private final HanStack<AnyType> stack;
    public BalancedSymbolChecker() {
        this.stack = new HanStack<>();
    }

    public void processStack(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String currentSymbol = String.valueOf(currentChar);
            Symbol symbol = Symbol.fromString(currentSymbol);

            if (symbol != null) {
                if (symbol.isOpeningSymbol()) {
                    stack.push((AnyType) symbol.getSymbol());
                } else if (symbol.isClosingSymbol()) {
                    if (stack.isEmpty()) {
                        throw new RuntimeException("Call stack is empty: " + currentChar);
                    }
                    else {
                        String poppedString = String.valueOf(stack.topAndPop());
                        Symbol poppedSymbol = Symbol.fromString(poppedString);

                        assert poppedSymbol != null;
                        if (symbol.getMatchingOpeningSymbol().getSymbol().compareTo(poppedSymbol.getSymbol()) != 0) {
                            throw new RuntimeException("Unbalanced symbols: " + poppedSymbol.getSymbol() + " + " + currentChar);
                        }
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            throw new RuntimeException("Unbalanced symbols remain on the stack");
        }
    }

    public void add(AnyType symbol) {
        stack.push(symbol);
    }

    public boolean isBalanced() {
        return stack.isEmpty();
    }

    public void remove() {
        stack.pop();
    }

    public AnyType peek() {
        return stack.top();
    }
}

/*
1. Make an empty stack.
2. Read symbols until the end of the file.
a. If the symbol is an opening symbol, push it onto the stack.
b. If it is a closing symbol, do the following.
i. If the stack is empty, report an error.
ii. Otherwise, pop the stack. If the symbol popped is not the corresponding opening symbol, report an error.
3. At the end of the file, if the stack is not empty, report an error.
 */