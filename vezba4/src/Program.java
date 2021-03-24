import lists.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addFirst(2);
        list.addLast(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
