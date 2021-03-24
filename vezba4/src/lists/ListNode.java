package lists;

public class ListNode {
    private Object element;
    private ListNode next;

    public ListNode(Object element){
        this.element = element;
    }

    public ListNode(Object element, ListNode next){
        this.element = element;
        this.next = next;
    }

    public Object getElement(){
        return this.element;
    }

    public ListNode getNext(){
        return this.next;
    }

    public void setElement(Object element){
        this.element = element;
    }

    public void setNext(ListNode node){
        this.next = node;
    }
}
