import java.util.stream.IntStream;

public class SumOfAllDivisors {
    public static void main(String[] args) {
        int num = 6;

        // Call for-loop method
        System.out.println(sumDivisor1(num));
        // Call streams method
        System.out.println(sumDivisor2(num));
    }

    // Using for-loop
    public static int sumDivisor1(int n) {
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j += i;
            }
        }
        return j;
    }

    // Using IntStream
    public static int sumDivisor2(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
