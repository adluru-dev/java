import java.util.stream.IntStream;

/**
 * Print the Fibonacci series for a given number
 */
public class Fibonacci {
    public static void main(String[] args) {
        int series = 10; // Given Number

        // Print generateFib1 output
        long[] fib1 = generateFib1(series);
        IntStream.range(0, series).mapToObj(i -> fib1[i] + " ").forEach(System.out::print);
        
        // Print generateFib2 output
        IntStream.range(0, series).mapToObj(i -> generateFib2(i) + " ").forEach(System.out::print);
    }

    // Using IntStream and for-loop
    public static long[] generateFib1(int n) {
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        IntStream.range(2, n).forEach(i -> fib[i] = fib[i - 2] + fib[i - 1]);
        return fib;
    }

    // Using recursion
    public static int generateFib2(int n) {
        if (n <= 1) {
            return n;
        }
        return generateFib2(n - 2) + generateFib2(n - 1);
    }
}
