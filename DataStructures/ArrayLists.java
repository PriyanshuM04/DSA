package DataStructures;

import java.util.*;

public class ArrayLists {

    // Insert: O(n)
    // Search: O(1)

    public static void main(String[] args) {
        // ----Create List----
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // ----Add Elements----
        list.add(0);
        list.add(2);
        list.add(3);
        
        System.out.println(list);

        // ----Get Elements----
        System.out.println(list.get(1));    // Index as Argument

        // ----Add Element in Between----
        list.add(1,1);    // Index, element as arguments in order
        System.out.println(list);

        // ----Set Element----
        list.set(0,5);    // Change element at index 0 to 5
        System.out.println(list);

        // ----Delete Element----
        list.remove(3);    // Index as argument
        System.out.println(list);

        // ----Size of List----
        int size = list.size();
        System.out.println(size);

        // ----Sorting----
        Collections.sort(list);
        System.out.println(list);
    }
}
