package Questions;

public class RecursionProblems {

    static void towerOfHanoi(int n, String source, String helper, String destination) {
        // Rules:
        // 1. One disk transferred at a time
        // 2. Smaller disk on top of larger disks

        // O(2^n)

        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");
    }

    // 26.30
}
