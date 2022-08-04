package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		// using stream api fetch greater than 6 digit name and less than 8

		List<String> list = Arrays.asList("Lemon brothers", "Rajeev", "AdamSmith", "Raj", "Sanjeev", "Pradeep");

		List<String> list1 = list.stream().filter(str -> str.length() > 6 && str.length() < 8)
				.collect(Collectors.toList());
		System.out.println(list1);

		// using foreach

		list.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str -> System.out.println(str));

		// using method reference

		list.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);

	}

}
