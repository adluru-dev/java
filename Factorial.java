import java.util.stream.IntStream;

/**
 * Find the Factorial of a given number
 *
 * Example: 3! = 3*2*1 = 6
 *          6! = 6*5*4*3*2*1 = 720 
 */
public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        // Call recursion method
        System.out.println(factorial1(num));
        // Call simple for-loop method
        System.out.println(factorial2(num));
        // Call streams method
        System.out.println(factorial3(num));
    }

    // Using recursion
    public static int factorial1(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial1(n - 1);
    }

    // Using simple for-loop
    public static int factorial2(int n) {
        int j = 1;
        for(int i = 2; i <= n; i++) {
            j *= i;
        }
        return j;
    }

    // Using IntStream
    public static int factorial3(int n) {
        return IntStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

}
