package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 8, 9, 7, 1, 3, 5, 4, 7, 8, 6);

		// min() and max() input type is comparator contain two values and return type
		// Optional and Optional class have a get() through this method we can get the
		// value

		Optional<Integer> listValue = list.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(listValue.get());

	}
}
