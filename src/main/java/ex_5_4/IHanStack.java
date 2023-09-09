package ex_5_4;

public interface IHanStack<AnyType> {
    void push(AnyType x); // insert
    void pop(); // remove
    AnyType top(); // find
    AnyType topAndPop(); // find + remove
    boolean isEmpty();
    void makeEmpty();
}
