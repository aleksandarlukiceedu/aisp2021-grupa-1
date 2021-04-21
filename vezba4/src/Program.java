import lists.LinkedList;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addLast("1");
        list.addFirst("2");
        list.addLast("3");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        String  x = list.getFirst() + list.getLast();
//        System.out.println(x);

        for (String s:list) {
            System.out.println(s);
        }
    }
}
