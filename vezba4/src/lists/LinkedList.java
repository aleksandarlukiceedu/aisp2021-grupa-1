package lists;

public class LinkedList {
    private ListNode head;
    private int listSize;

    public void addFirst(Object element){
        ListNode newNode = new ListNode(element, head);
        head = newNode;
        listSize++;
    }

    public void addLast(Object element){
        ListNode newNode = new ListNode(element);
        if(head == null){
            head = newNode;
            listSize++;
        }
        else{
            ListNode lastNode = getLastNode();
            lastNode.setNext(newNode);
            listSize++;
        }
    }

    public void add(int index, Object element){

    }

    public Object getFirst(){
        return null;
    }

    public Object getLast(){
        return null;
    }

    public Object get(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        int i = 0;
        ListNode currentNode = head;

        while (currentNode != null){
            if(index == i){
                return currentNode.getElement();
            }

            currentNode = currentNode.getNext();
            i++;
        }

        return null;
    }

    public void set(int index, Object element){

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public void remove(int index){

    }

    public void remove(Object element){

    }

    public int size(){
        return listSize;
    }

    private ListNode getLastNode() {
        if(head == null){
            return null;
        }
        ListNode currentNode = head;

        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
}
