package streamtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted  , sorted() by default printing ascending order
public class SortedDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 6, 7, 2, 7, 8, 4);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// foreach
		list.stream().sorted().forEach(l -> System.out.print(l));

		// method reference
		list.stream().sorted().forEach(System.out::println);
		
		// for descending order we must use comprator
		list.stream().sorted(Comparator.reverseOrder()).forEach(l ->System.out.println(l));
		

		System.out.println("=============================");
		// for string

		List<String> stringList = Arrays.asList("r", "d", "r", "e", "s");
		List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// foreach
		
		stringList.stream().sorted().forEach(l ->System.out.print(l));
		System.out.println("=======");

		// method reference
		stringList.stream().sorted().forEach(System.out::print);
		
		//descending order
		stringList.stream().sorted(Comparator.reverseOrder()).forEach(str -> System.out.println(str));
	}
}
