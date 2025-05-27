package Questions;

public class GoodNumbers {
    public static int countGoodNumbers(long n) {
        long mod = 1_000_000_007;
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evens = power(5, evenPositions, mod); // Even indices (0, 2, 4, ...)
        long odds = power(4, oddPositions, mod);   // Odd indices (1, 3, 5, ...)

        return (int)((evens * odds) % mod);
    }
    static long power(long base, long exponent, long mod) {
        long result = 1;
        for (long i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));
    }
}
