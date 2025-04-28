package Questions;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Recursion_questions {

    public static void towerOfHanoi(int n, String src, String helper, String dest){
//        Rules:
//        1. Only one disk is transferred in 1 step
//        2. Smaller disks are always kept on top of larger disks

        // O(2**n)

        if (n==1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void revString(String str, int idx) {
        // O(n)

        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revString(str, idx - 1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void fLOccurrences(String str, char elem, int idx){
        // O(n)

        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char  currChar = str.charAt(idx);
        if (currChar == elem) {
            if (first == -1){
                first = idx;
                last = idx;
            }
            else{
                last = idx;
            }
        }
        fLOccurrences(str, elem, idx + 1);
    }

    public static boolean checkSorted(int[] arr, int currIdx) {
        // O(n)

        if (currIdx == arr.length - 1) {
            return true;
        }
        if (arr[currIdx] < arr[currIdx + 1]){
            return checkSorted(arr, currIdx + 1);
        }
        else {
            return false;
        }
    }

    public static void moveX(String str, int idx, int count, String newStr) {
        // O(n)

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveX(str, idx+1, count, newStr);
        }
        else {
            newStr += currChar;
            moveX(str, idx+1, count, newStr);
        }
    }

    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString) {
        // O(n)

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString += currChar;
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void subsequences(String str, int idx, String newString) {
        // O(2^n)
        // Every character has a choice to be included or not, but order must be as in the original string

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString+currChar);
        // not to be
        subsequences(str, idx+1, newString);
    }

    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        // USE HASHSET

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        uniqueSubsequences(str, idx+1, newString+currChar, set);
        // not to be
        uniqueSubsequences(str, idx+1, newString, set);
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void keyPad(String str, int idx, String combination) {
        // O(4^n)

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for (int i=0; i<mapping.length(); i++) {
            keyPad(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Tower of Hanoi
//        int n = 3;
//        towerOfHanoi(n, "S", "H", "D");

        // Reverse String
//        String str = "Pickachu";
//        revString(str, str.length()-1);

        // First and Last Occurrences of an element in a String
//        String str = "abaacdaefaah";
//        char element = 'a';
//        fLOccurrences(str, element, 0);

        // Check if an array is sorted (strictly increasing)
//        int[] arr = {1,2,5};
//        System.out.println(checkSorted(arr, 0));

        // Move all 'x' to the end of the String
//        String str = "axbcxxd";
//        moveX(str, 0, 0, "");

        // Remove duplicates in a String
//        String str = "abbccda";
//        removeDuplicates(str, 0, "");

        // Print all subsequences of a string
//        String str = "abc";
//        subsequences(str, 0, "");

        // Print all unique subsequences of a string
//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequences(str, 0, "", set);

        // Print KeyPad Combination
        String str = "23";
        keyPad(str, 0, "");
    }
}
