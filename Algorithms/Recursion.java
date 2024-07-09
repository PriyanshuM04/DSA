package Algorithms;

import java.util.Optional;

public class Recursion {

    static void printNums(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + ", ");
        printNums(n-1);
    }

    static int nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nSum(n-1);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    static void fibonacci(int a, int b, int n) {
        if (a == 0 && b == 1) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
        if (n<=2) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
    }

    static int xPower(int x, int n) {
        // stack height = n
        if (n == 0 || x == 0) {
            if (n == 0 && x == 0) return -1;
            else if (x == 0) return 0;
            else if (n == 0) return 1;
        }
        return x * xPower(x, n-1);
    }

    static int power(int x, int n){
        // Stack Height = log n
        if (x == 0)return 0;
        if (n == 0) return 1;

        if (n%2 == 0){
            int value = power(x,n/2);
            return value*value;
        }
        else {
            int value = power(x,(n-1)/2);
            return x*value*value;
        }

    }

    public static void main(String[] args) {
//        printNums(5);
//        System.out.println(nSum(5));
//        System.out.println(factorial(0));
//        fibonacci(0, 1, 7);
//        System.out.println(xPower(5,7));
        System.out.println(power(5,3));
    }
}
