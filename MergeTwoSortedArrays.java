/**
* Merge 2 sorted arrays using Java 8 Streams
* int[] a = {1,2,4,6} 
* int[] b = {2,3,4,5,7}
* Output should be 1,2,2,3,4,4,5,6,7 
*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergedTwoSortedArrays {
  public static void main(String[] args) {
    int[] a = {1,2,4,6};
    int[] b = {2,3,4,5,7};
    IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::println);
  }
}
