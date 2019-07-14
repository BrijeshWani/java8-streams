package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIterator {
	public static void main(String[] args) {
		// Streams with array of objects
		String[] stringArray = new String[] { "1", "2", "3", "4" };
		Arrays.stream(stringArray).forEach(str -> System.out.println(str));

		// Streams with array of primitive types
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };
		int minimumIntegerValue = Arrays.stream(intArray).min().getAsInt();
		int maximumIntegerValue = Arrays.stream(intArray).max().getAsInt();
		int sum = Arrays.stream(intArray).sum();
		List<Integer> boxedList = Arrays.stream(intArray).boxed().collect(Collectors.toList());

		System.out.println("Min: " + minimumIntegerValue);
		System.out.println("Max: " + maximumIntegerValue);
		System.out.println("Sum: " + sum);
		System.out.println("Boxed List: " + boxedList);

		List<String> listOfString = Arrays.asList("A", "B", "C", "D", "E", "F");

		// Skip method
		List<String> skippedList = listOfString.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped list: " + skippedList);
		
		//Skip and limit
		List<String> skippedAndLimitedList = listOfString.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println("Skipped and limi list: " + skippedAndLimitedList);

		System.out.println("Page 1 of size 2: " + getPage(1, 2, listOfString));
		System.out.println("Page 2 of size 2: " + getPage(2, 2, listOfString));
		System.out.println("Page 1 of size 100: " + getPage(1, 100, listOfString));
	}

	private static List<String> getPage(final int page, final int size, final List<String> listOfString) {
		return listOfString.stream().skip((page - 1) * size).limit(size).collect(Collectors.toList());
	}
}
