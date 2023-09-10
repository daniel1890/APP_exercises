package ex_5_5;

public interface IHanQueue<AnyType> {
    void enqueue(AnyType element);
    //or insertion at the back of the line
    AnyType dequeue();
    //or removal of the item from the front of the line
    AnyType getFront();
    //or access of the item at the front of the line
    String toString();
}
