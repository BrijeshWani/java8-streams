package java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsReduceFunction {
	public static void main(String[] args) {

		// Reduce function
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sumOfNumbers = numbers.stream().reduce(0, (total, number) -> Integer.sum(total, number));
		System.out.println("Sum of numbers: " + sumOfNumbers);

		// Here (total, number) parameters are passed in the same order.
		sumOfNumbers = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of numbers: " + sumOfNumbers);
	}
}
