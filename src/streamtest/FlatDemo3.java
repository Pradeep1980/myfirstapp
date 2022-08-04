package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	int id;
	String name;
	char grade;

	Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

}

public class FlatDemo3 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Pradeep", 'A'));
		list.add(new Student(102, "Sanjeev", 'B'));
		list.add(new Student(103, "Rajeev", 'C'));

		List<Student> list1 = new ArrayList<Student>();
		list.add(new Student(104, "Adam", 'A'));
		list.add(new Student(105, "Smith", 'B'));
		list.add(new Student(106, "John", 'C'));

		List<List<Student>> finalList = Arrays.asList(list, list1);

		List<String> studentList = finalList.stream().flatMap(l -> l.stream()).filter(l -> l.grade > 'B')
				.map(l -> l.name).collect(Collectors.toList());
		System.out.println(studentList);

	}

}
