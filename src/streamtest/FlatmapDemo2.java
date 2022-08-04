package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo2 {

	public static void main(String[] args) {

		List<String> s1 = Arrays.asList("Ram", "Shyam");
		List<String> s2 = Arrays.asList("Shruti", "Pratishtha");
		List<String> s3 = Arrays.asList("Gauri", "Kavya");

		List<List<String>> finalString = new ArrayList<List<String>>();
		finalString.add(s1);
		finalString.add(s2);
		finalString.add(s3);

		// using flatmap for converting into one stream

		List<String> names = finalString.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(names);
		// using foreach
		finalString.stream().flatMap(list -> list.stream()).forEach(l -> System.out.println(l));

		// using method reference
		finalString.stream().flatMap(list -> list.stream()).forEach(System.out::print);

	}

}
