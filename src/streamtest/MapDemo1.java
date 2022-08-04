package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {

		// print list name in uppercase using stream api
		List<String> list = Arrays.asList("rajeev", "sanjeev", "pradeep");

		List<String> list1 = new ArrayList<String>();

		list1 = list.stream().map(l -> l.toUpperCase()).collect(Collectors.toList());
		System.out.println(list1);

		// using foreach

		list.stream().map(l -> l.toUpperCase()).forEach(l -> System.out.println(l));

		// using method reference

		list.stream().map(l -> l.toUpperCase()).forEach(System.out::println);

	}

}
