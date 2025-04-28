package DataStructures;

import java.util.*;
public class Array {
    public static void printArray(int[] arr) {
        int len = arr.length;
        for (int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};      // Array declaration with Values
        int[] arr2 = new int[5];        // Array declaration with size

//        printArray(arr);
//        printArray(arr2);

        // Update Array elements
        arr2[0] = 100;
        arr2[3] = 400;
//        printArray(arr2);

        // Copying an Array
        int[] arr3, arr4, arr5;

        // Shallow Copy:- changes made in arr3 will be reflected in arr as well
        arr3 = arr;

        // Deep Copy: Changes made in arr4 will not be reflected in arr2
        arr4 = arr2.clone();
    }
}
