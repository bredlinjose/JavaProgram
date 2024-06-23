package method.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// trasforming
public class MapDemo1 {
/*
 * Converts the array elements into uppercase
 */
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List<String> vehiclesInUpper = new ArrayList<String>();
		
		/*
		 * // without stream 
		 * for (String string : vehicles) {
		 * vehiclesInUpper.add(string.toUpperCase()); 
		 * }
		 * System.out.println(vehiclesInUpper);
		 */
		
		// with stream
		vehiclesInUpper = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesInUpper);
		
		vehicles.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		
		

	}

}
