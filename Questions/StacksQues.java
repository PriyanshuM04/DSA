package Questions;

import java.util.*;

public class StacksQues {
    public static void nextGreaterElem(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] resArr = new int[arr.length];
        for (int i=arr.length-2; i>=0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) resArr[i] = -1;
            else {
                resArr[i] = st.peek();
            }
            st.push(arr[i]);
        }

        // Print resultant Array
        for (int num : resArr) System.out.print(num + " ");
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        nextGreaterElem(arr);
    }
}
