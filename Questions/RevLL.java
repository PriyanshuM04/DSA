package Algorithms;
import java.util.LinkedList;

// Space Complexity = O(1)
// Time Complexity = O(n)

import DataStructures.Linked_List;

public class RevLL {
    public static void main(String[] args) {
//        LinkedList<Integer> list= new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);

        Linked_List list1 = new Linked_List();
        list1.addLast("1");
        list1.addLast("2");
        list1.addLast("3");
        list1.addLast("4");
        list1.printList();

//        list1.reverseIterate();
        list1.head = list1.reverseRecursive(list1.head);
        list1.printList();
    }
    // 12.50
}
