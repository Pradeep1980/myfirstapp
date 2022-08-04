package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> finalList = Arrays.asList(list, list2, list3);
//first using flatMap converting all list into one stream and perform whatever you want operation through filter and map
		List<Integer> finalResult = finalList.stream().flatMap(x -> x.stream()).filter(l -> l % 2 == 0).map(l -> l * 2)
				.collect(Collectors.toList());
		System.out.println(finalResult);

		// using foreach
		finalList.stream().flatMap(x -> x.stream()).filter(l -> l % 2 == 0).map(l -> l * 2)
				.forEach(l -> System.out.print(l));

		// using method reference

		finalList.stream().flatMap(x -> x.stream()).filter(l -> l % 2 == 0).map(l -> l * 2)
				.forEach(System.out::println);

	}

}
