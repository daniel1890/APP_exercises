package ex_5_4;

import ex_5_3.HanLinkedList;

public class HanStack<AnyType> implements IHanStack<AnyType> {
    private final HanLinkedList<AnyType> linkedList;
    public HanStack() {
        this.linkedList = new HanLinkedList<>();
    }

    @Override
    public void push(AnyType x) {
        linkedList.addFirst(x);
    }

    @Override
    public void pop() {
        linkedList.removeFirst();
    }

    @Override
    public AnyType top() {
        return linkedList.getFirst();
    }

    @Override
    public AnyType topAndPop() {
        return linkedList.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.getLength() == 0;
    }

    @Override
    public void makeEmpty() {
        while(linkedList.getLength() > 0) {
            linkedList.removeFirst();
        }
    }
}
