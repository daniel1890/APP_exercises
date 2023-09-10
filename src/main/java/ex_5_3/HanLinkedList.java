package ex_5_3;

/*
 Implementeer een generic singly-linked-list klasse HANLinkedList<T>. Maak gebruik
van een header node, zoals voorgeschreven in het boek. Maak unittests. Doe dit
door de gegeven interface IHANLinkedList<T> te implementeren
 */
public class HanLinkedList<AnyType> implements IHanLinkedList<AnyType> {
    private ListNode head;

    public int getLength() {
        return length;
    }

    private int length;

    public HanLinkedList() {
        this.head = null;
    }

    @Override
    public void addLast(AnyType element) {
        if (this.head == null) {
            this.head = new ListNode(element);
        } else {
            ListNode current = this.head;

            while (current.getNext()!= null) {
                current = current.getNext();
            }

            current.setNext(new ListNode(element));
        }

        this.length++;
    }

    @Override
    public void addFirst(AnyType element) {
        if (this.head == null) {
            this.head = new ListNode(element);
        }
        else {
            ListNode newNode = new ListNode(element);
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
    }

    @Override
    public AnyType getFirst() {
        if (this.head!= null) {
            return (AnyType) this.head.getData();
        }
        else {
            return null;
        }
    }

    @Override
    public AnyType getLast() {
        if (this.head == null) {
            return null;
        } else {
            ListNode current = this.head;

            while (current.getNext()!= null) {
                current = current.getNext();
            }

            return (AnyType) current.getData();
        }
    }

    @Override
    public AnyType removeFirst() {
        if(this.head == null) {
            return null;
        }
        else {
            ListNode current = this.head;

            if (current.getNext() == null) {
                this.head = null;
            } else {
                this.head = current.getNext();
            }

            this.length--;
            return (AnyType) current.getData();
        }
    }

    @Override
    public AnyType removeLast() {
        if (this.head == null) {
            return null;
        }
        else {
            ListNode current = this.head;
            ListNode previous = null;

            while (current.getNext()!= null) {
                previous = current;
                current = current.getNext();
            }

            if (previous != null) {
                previous.setNext(null);
            }

            this.length--;
            return (AnyType) current.getData();
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (this.head == null) {
            result = new StringBuilder("Linked list is empty");
        } else {
            ListNode current = this.head;
            int iterator = length;

            result.append("Position ").append(iterator).append(" contains -> ").append(current.getData()).append("\n");

            while (current.getNext() != null) {
                iterator--;

                current = current.getNext();
                result.append("Position ").append(iterator).append(" contains -> ").append(current.getData()).append("\n");
            }

        }

        return result.toString();
    }
}
