package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPatternUsingLambdaExpression {

	private static int addValues(List<Integer> numbers, Predicate<Integer> selector) {
		return numbers.stream().filter(selector).reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Add all numbers
		System.out.println("Addition of all numbers: " + addValues(numbers, e -> true));

		// Add all even numbers
		System.out.println("Addition of all even numbers: " + addValues(numbers, e -> e % 2 == 0));

		// Add all odd numbers
		System.out.println("Addition of all odd numbers: " + addValues(numbers, e -> e % 2 != 0));

	}
}
