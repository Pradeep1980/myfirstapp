package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> list= new ArrayList<Integer>();
		 * 
		 * list.add(10); list.add(15); list.add(20); list.add(25); list.add(30);
		 */

		List<Integer> al = new ArrayList<Integer>();
		//return into list, way1
		List<Integer> list1 = Arrays.asList(10, 15, 20, 25, 30);
		al = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(al);
		
		//using consumer foreach ,way2
		
		list1.stream().filter(n->n%2==0).forEach(n-> System.out.print(n));
		
		//using reference method , way3
		
		list1.stream().filter(n ->n%2==0).forEach(System.out::println);

	}

}
