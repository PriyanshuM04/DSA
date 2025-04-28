package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TargetSum {

    public static void pairSum(int[] arr, int target) {
        int count = 0;
        int len = arr.length;

        // Brute-Force approach
        // Time = O(n^2)
        // Space = O(1)

//        for (int i=0; i<len-1; i++) {
//            for (int j=i+1; j<len; j++) {
//                if (arr[i] + arr[j] == target) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);


        // Approach 2: Sorting + Two Pointers (for sorted arrays)
        // Time = O(nlogn) for sorting and O(n) for two pointer
        // Space = O(1)

//        Arrays.sort(arr);
//        int start = 0;
//        int end = len-1;
//        while (start<end) {
//            int sum = arr[start] + arr[end];
//            if (sum == target) {
//                count++;
//                start++;
//                end--;
//            }
//            else if (sum<target) start++;
//            else end--;
//        }
//        System.out.println(count);


        // Approach 3: HashSet (Best Approach)
        // Time = O(n)
        // Space = O(n)

        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target-num)) {
                count++;
            }
            seen.add(num);
        }
        System.out.println(count);
    }

    public static void tripletsSum(int[] arr, int target) {
        int count = 0;
        int len = arr.length;

        // Approach 1: Brute Force
        // Time = O(n^3)
        // Space = O(1)

//        for (int i=0; i<len; i++) {
//            for (int j=i+1; j<len; j++) {
//                for (int k=j+1; k<len; k++) {
//                    if (arr[i] + arr[j] + arr[k] == target) count++;
//                }
//            }
//        }
//        System.out.println(count);


        // Approach 2: Sorting + Two Pointer
        // Time = O(n^2)
        // Space = O(1)

        Arrays.sort(arr);
        for (int i=0; i<len-2; i++) {
            int left = i+1, right = len-1;
            while (left<right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum==target) {
                    count++;
                    left++;
                    right--;
                }
                else if (sum<target) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println(count);
    }

    public static void uniqueNum(int[] arr) {
        int len = arr.length;

        // Approach 1: Brute Force
        // Time = O(n^2)
        // Space = O(1)

//        for (int i=0; i<len; i++) {
//            int count = 0;
//            for (int j=0; j<len; j++) {
//                if (arr[i] == arr[j]) count++;
//            }
//            if (count==1) System.out.println(arr[i]);
//        }


        // Approach 2: HashSet
        // Time = O(n)
        // Space = O(n)

//        HashSet<Integer> seen = new HashSet<>();
//        int setSum = 0, sumArr = 0;
//        for (int num : arr) {
//            if (seen.contains(num));
//            else {
//                seen.add(num);
//                setSum += num;
//            }
//            sumArr += num;
//        }
//        int answer = setSum*2 - sumArr;
//        System.out.println(answer);


        // Approach 3: HashMap
        // Time = O(n)
        // Space = O(n)

//        HashMap<Integer, Boolean> map = new HashMap<>();
//        for (int num : arr) {
//            if (map.containsKey(num)) {
//                map.put(num, false);
//            } else {
//                map.put(num, true);
//            }
//        }
//        for (int key : map.keySet()) {
//            if (map.get(key)) {
//                System.out.println(key);
//            }
//        }


        // Approach 4: XOR method (Best method)
        // Time = O(n)
        // Space = O(1)

        int result = 0;
        for (int num : arr) {
            result ^= num;  // a XOR 0 = a, a XOR a = 0
        }
        System.out.println(result);
    }

    public static void secondLargest(int[] arr) {
        // Time = O(n)
        // Space = O(1)

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num>largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Element found!");
        } else {
            System.out.println(secondLargest);
        }
    }

    public static Integer firstRepeat(int[] arr) {
        // Time = O(n)
        // Space = O(n)

        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        // Find the total number of pairs in the Array whose sum is equal to the given value
//        int[] arr = {4,6,3,5,8,2};
//        int target = 7;
//        pairSum(arr, target);

        // Find the number of triplets whose sum is equal to the given value
//        int[] arr = {1,4,5,6,3};
//        int target = 12;
//        tripletsSum(arr, target);

        // Program to find a unique number in a given array where all the elements are being repeated twice with one value being unique
//        int[] arr = {1,2,3,43,2,1,3};
//        uniqueNum(arr);

        // Program to find the second-largest element in the given array
//        int[] arr = {10, 20, 30, 40, 50};  // Output: 40
//        int[] arr = {5, 5, 5};             // Output: No second largest
//        int[] arr = {100};                 // Output: No second largest
//        int[] arr = {2, 1};                // Output: 1
//        int[] arr = {-5, -2, -9};          // Output: -5
//        secondLargest(arr);

        // For an array of integers return the first value that is repeating in the array
        int[] arr = {3, 4, 1, 4, 5, 6};
        System.out.println(firstRepeat(arr));
    }
}
