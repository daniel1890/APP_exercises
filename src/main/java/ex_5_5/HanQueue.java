package ex_5_5;

import ex_5_3.HanLinkedList;

public class HanQueue<AnyType> implements IHanQueue<AnyType> {
    private final HanLinkedList<AnyType> linkedList;
    public HanQueue() {
        this.linkedList = new HanLinkedList<>();
    }

    @Override
    public void enqueue(AnyType element) {
        this.linkedList.addLast(element);
    }

    @Override
    public AnyType dequeue() {
        return this.linkedList.removeFirst();
    }

    @Override
    public AnyType getFront() {
        return this.linkedList.getFirst();
    }
}
