package streamtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator8 {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Pradee", 3758, "indore", 1));
		emp.add(new Employee(104, "rajeev", 2531, "jabalpur", 5));
		emp.add(new Employee(105, "sanjeev", 1200, "bhopal", 4));
		emp.add(new Employee(103, "dinesh", 784, "korba", 3));
		emp.add(new Employee(106, "rajkamal", 300, "indore", 1));
		emp.add(new Employee(107, "mithun", 1562, "indore", 5));

		// comparator using 8
		emp.sort(Comparator.comparing(Employee::getName));
		emp.forEach(empl -> {
			System.out.println(empl.getName() + " " + empl.getAddress());
		});
		System.out.println("========================");
		// reversed ordering

		

	}

}
