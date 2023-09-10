package ex_5_6;

public interface IBalancedSymbolChecker<AnyType> {
    void processStack(String input);
    boolean isBalanced();
    String toString();
}
