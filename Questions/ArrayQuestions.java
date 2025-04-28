package Questions;

import java.util.HashSet;

public class ArrayQuestions {
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] revArr(int[] arr, int left, int right) {
        // Two Pointer approach
        // Time = O(n)
        // Space = O(1)

//        int left = 0, right = arr.length-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
        }

    public static void kRotate(int[] arr, int k) {
        int len = arr.length;
        if (len == 0) return;
        k = k % len;

        // Without extra space
        // Time =  O(n)
        // Space = O(1)

//        revArr(arr, 0, len-1);      // Reverse the whole array
//        revArr(arr, 0, k-1);        // Reverse k elements
//        revArr(arr, k, len-1);      // Reverse remaining elements
//        printArr(arr);

        // Using Extra Space
        // Time = O(n)
        // Space = O(1)

        int[] newArr = new int[len];
        for (int i=0; i<len; i++) {
            int newIndex = (i+k)%len;
            newArr[newIndex] = arr[i];
        }
        printArr(newArr);
    }

    public static void qSearch(int[] arr, int[] queries) {
        HashSet<Integer> seen = new HashSet<>();
        for (int nums : arr) {
            seen.add(nums);
        }
        for (int num : queries) {
            if (seen.contains(num)) {
                System.out.print("Yes ");
            } else {
                System.out.print("No ");
            }
        }
    }

    public static void main(String[] args) {
        // Reverse an Array
//        int[] test1 = {};                            // Empty array
//        int[] test2 = {5};                           // Single element
//        int[] test3 = {1, 2};                        // Two elements
//        int[] test4 = {1, 2, 3, 4, 5};               // Odd number of elements
//        int[] test5 = {10, 20, 30, 40, 50, 60};      // Even number of elements
//        int[] test6 = {-5, -10, 15, 20};             // Contains negative numbers
//        int[] test7 = {0, 0, 0, 0};                  // All same elements
//        int[] test8 = {1000000, 999999, 1, -100000}; // Large and small values
//        printArr(revArr(test4, 0, test4.length-1));

        // Rotate the array by 'K' steps (with and without extra space)
//        int[] test1 = {};                          // Empty array
//        int[] test2 = {5};                         // Single element
//        int[] test3 = {1, 2};                      // Two elements
//        int[] test4 = {1, 2, 3, 4, 5};             // Rotate by 2, odd-length
//        int[] test5 = {10, 20, 30, 40, 50, 60};    // Rotate by 3, even-length
//        int[] test6 = {-5, -10, 15, 20};           // Contains negative numbers
//        int[] test7 = {0, 0, 0, 0};                // All same elements
//        int[] test8 = {1000000, 999999, 1, -100000}; // Large & small values
//        int[] test9 = {1, 2, 3, 4, 5};             // k = 0 (no rotation)
//        int[] test10 = {1, 2, 3, 4, 5};            // k = length (full rotation)
//        int[] test11 = {1, 2, 3, 4, 5};            // k > length (check modulo)
//        kRotate(test9,test9.length+1);

        // Check if number is present or not
        int[] arr = {1000000, 999999, -100000, 42};
        int[] queries = {999999, 123456, -100000};
        qSearch(arr, queries);
    }
}
