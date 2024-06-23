package other.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountLimit {

	public static void main(String[] args) {
		List<String> vehicleList = Arrays.asList("bus","car","bicycle","bus","car","car","bike");
		
		// distinct
		List<String> dis = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(dis); //O/P: [bus, car, bicycle, bike]
		
		vehicleList.stream().distinct().forEach(val -> System.out.println(val));
		
		// count
		long count = vehicleList.stream().distinct().count();
		System.out.println("Count: "+ count);
		
		//limit
		List<String> limitedVehicle = vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehicle);

	}

}
