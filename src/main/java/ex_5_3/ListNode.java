package ex_5_3;

public class ListNode {
    private Object data;
    private ListNode next;
    ListNode(Object data) {
        this.data = data;
        this.next = null;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}
