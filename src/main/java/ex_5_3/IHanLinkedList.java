package ex_5_3;

public interface IHanLinkedList<AnyType> {
    void addLast(AnyType node);
    void addFirst(AnyType node);
    AnyType getFirst();
    AnyType getLast();
    AnyType removeFirst();
    AnyType removeLast();
}
