// FizzBuzz Implementation using Streams in Java 8
public class FizzBuzz {
  public static void main(String[] args) {
    IntStream.rangeClosed(1,100)
      .mapToObj(a -> a % 3 == 0 ? (a % 5 == 0 ? "FizzBuzz" : "Fizz") : (a % 5 == 0 ? "Buzz" : a)
      .forEach(System.out::println);
  }
}
