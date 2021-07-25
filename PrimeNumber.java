import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Find the given number is a prime number of not
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7; // find if 7 is a prime or not
		boolean isPrime = true;
		
		// 1) Simple for loop
		for(int i = num - 1; i > 1; i--) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(num + " is " + (!isPrime ? "not " : "") + "a prime number.");

		// 2) Simple for loop
		isPrime = true;
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(num + " is " + (!isPrime ? "not " : "") + "a prime number.");

		// 3) Using IntStream
		isPrime = IntStream.rangeClosed(2, num/2).noneMatch(i -> num%i == 0);
		System.out.println(num + " is " + (!isPrime ? "not " : "") + "a prime number.");
		
		// 4) Using isProbablePrime
		isPrime = BigInteger.valueOf(num).isProbablePrime(1);
		System.out.println(num + " is " + (!isPrime ? "not " : "") + "a prime number.");
	}
	
}
