package method.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// trasforming
public class MapDemo2 {
/*
 * get the length of all the elements int the list and store it in another collection
 * print length
 */
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List<Integer> vehicleslength = new ArrayList<Integer>();
		
		vehicleslength= vehicles.stream().map(veh -> veh.length()).collect(Collectors.toList());
		System.out.println(vehicleslength);
		
		vehicles.stream().map(veh -> veh.length()).forEach(System.out::println);

	}

}
