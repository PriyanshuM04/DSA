package DataStructures;

import java.util.*;

class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.add("List");    // addLast or add both are same

        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();
        list.remove();  // remove and removeFirst are same

        System.out.println(list);
    }
}
