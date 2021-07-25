/**
 * There are multiple ways that you can and here are some of them
 */
 
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		String strValue = "Reverse String";
		int len = strValue.length();

		// 1) Using charAt with forward loop
		StringBuffer reverseString = new StringBuffer("");
		for (int i = 0; i < len; i++) {
			reverseString.append(strValue.charAt(len - i - 1));
		}
		System.out.println("reverse 1 ->" + reverseString);

		// 2) Using charAt with backward loop
		reverseString = new StringBuffer("");
		for (int i = len - 1; i >= 0; i--) {
			reverseString.append(strValue.charAt(i));
		}
		System.out.println("reverse 2 ->" + reverseString);

		// 3) Using String Buffer reverse method
		reverseString = new StringBuffer(strValue);
		System.out.println("reverse 3 ->" + reverseString.reverse());

		// 4) Using StringBuilder reverse method
		StringBuilder builder = new StringBuilder(strValue);
		System.out.println("reverse 4 ->" + builder.reverse());

		// 5) Using IntStream, map, mapTOObj, collect
		String reverse = IntStream.range(0, len).map(i -> strValue.charAt(len - i - 1))
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println("reverse 5 ->" + reverse);

		// 6) Using IntStream, map, collect
		reverse = IntStream.range(0, len).map(i -> strValue.charAt(len - i - 1))
				.collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
				.toString();
		System.out.println("reverse 6 ->" + reverse);
	}

}
