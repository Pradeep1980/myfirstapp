package streamtest;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("rajeev", "sanjeev", "pradeep");

		// find out each string length using stream api

		list.stream().map(l -> l.length()).forEach(l -> System.out.print(l));

		// using method reference

		System.out.println("============");

		list.stream().map(l -> l.length()).forEach(System.out::print);

	}

}
