package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyArray {
	public static void main(String[] args) {

		Integer[] interger = { 20, 25, 10, 4, 8, 10, 15 };

		List<Integer> numbers = Arrays.asList(interger);

		// stream()

		Optional<Integer> newNumber = numbers.stream().reduce((a, b) -> a * b);
		if (newNumber.isPresent()) {
			System.out.println(newNumber.get());
		} else {
			System.out.println("Number is not there");
		}

	}

}
