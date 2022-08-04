package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {

		// map
		List list = Stream.of("5", "10", "9").map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(list);

		// flatMap

		List list1 = Arrays.asList(2, 7, 9);
		List list2 = Arrays.asList(1, 5, 8);

		List<> list3 = Stream.of(list1, list2).flatMap(x -> x.stream()).collect(Collectors.toList());

	}

}
