package streamtest;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		list.stream().map(l -> l * 3).forEach(l -> System.out.println(l));
		
		//using method reference
		
		list.stream().map(l ->l*3).forEach(System.out::println);
		

	}

}
