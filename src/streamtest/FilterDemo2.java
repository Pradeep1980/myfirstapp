package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {

		// print string name and removing null value

		List<String> words = Arrays.asList("ram", null, "shyam", null, "raj", "kiran", null);

		List<String> list = new ArrayList<String>();

		list = words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println(list);

	}

}
