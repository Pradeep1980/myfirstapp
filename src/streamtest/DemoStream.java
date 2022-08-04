package streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {

		List<String> vehicle = Arrays.asList("bus", "car", "bus", "jeep", "car", "helicopter", "truck");

		List<String> finalVehicle = vehicle.stream().distinct().collect(Collectors.toList());

		System.out.println(finalVehicle);

		// using foreach

		vehicle.stream().distinct().forEach(l -> System.out.println(l));

		// using method refernce

		vehicle.stream().distinct().forEach(System.out::println);

	}

}
