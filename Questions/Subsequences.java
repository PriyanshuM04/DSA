package Questions;

import java.util.ArrayList;

public class Subsequences {
    public static void generateAllSubsequences (int[] arr, int idx, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> list) {
        int n = arr.length;
        if (idx >= n) {
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[idx]);
        generateAllSubsequences(arr, idx + 1, curr, list);
        curr.remove(curr.size() - 1);
        generateAllSubsequences(arr, idx + 1, curr, list);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generateAllSubsequences(arr, 0, new ArrayList<>(), result);

        System.out.println(result);
    }
}
