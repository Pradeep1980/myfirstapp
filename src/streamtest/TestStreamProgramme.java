package streamtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamProgramme {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Pradee", 3758, "indore", 1));
		emp.add(new Employee(104, "rajeev", 2531, "jabalpur", 5));
		emp.add(new Employee(105, "sanjeev", 4000, "bhopal", 4));
		emp.add(new Employee(103, "dinesh", 784, "korba", 3));
		emp.add(new Employee(106, "rajkamal", 300, "indore", 1));
		emp.add(new Employee(107, "mithun", 1562, "indore", 5));

		//1:- employee details based on depatment.

		Map<Integer, List<Employee>> map = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));

		// iterat
		map.entrySet().forEach(x -> {
			System.out.println(x.getKey() + "" + x.getValue());
		});

		//2:- sorting by city

		Map<String, List<Employee>> empList = emp.stream().collect(Collectors.groupingBy(Employee::getAddress));

		empList.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "" + e.getValue());
		});
		
		System.out.println("==============");
		//3:- Max and min salary
		
	Optional<Employee> empList1= emp.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
	
		System.out.println(empList1);
		
		

	}

}
