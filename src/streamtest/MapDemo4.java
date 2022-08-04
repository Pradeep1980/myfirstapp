package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {

	int id;
	String name;
	int salary;

	public Employee1() {
	}

	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class MapDemo4 {

	public static void main(String[] args) {

		List<Employee1> list = Arrays.asList(new Employee1(101, "Ram", 20000), new Employee1(102, "shyam", 30000),
				new Employee1(103, "shiv", 40000), new Employee1(104, "pankaj", 50000),
				new Employee1(105, "kishan", 60000));

		// greater than 30k salary and print all salary // for that using flat and map method

		List<Integer> emp = list.stream().filter(l -> l.salary > 30000).map(l -> l.salary).collect(Collectors.toList());
		System.out.println(emp);
	}
}
