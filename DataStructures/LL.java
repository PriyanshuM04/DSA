package DataStructures;

import java.util.*;

class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.add("List");    // addLast or add both are same

        System.out.println(list);

        System.out.println(list.size());

        for (String s : list) {
            System.out.print(s + "->");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();
        list.remove();  // remove and removeFirst are same

        System.out.println(list);
    }
}
