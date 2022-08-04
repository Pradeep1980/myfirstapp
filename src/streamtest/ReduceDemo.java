package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("r", "d", "6", "9", "8", "f", "q", "2");

		Optional<String> finalCombinedString = list.stream().reduce((value, combinedValue) -> {
			return combinedValue + value;
		});
		System.out.println(finalCombinedString.get());

	}

}
