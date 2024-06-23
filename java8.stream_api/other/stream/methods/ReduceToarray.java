package other.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceToarray {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		
		// reduce()
		Optional<String> reduced = stringList.stream().reduce((identity, accumulator)-> {
			return identity+accumulator;
		});
		
		System.out.println(reduced.get());
		
		// toArray
		Object[] arr = stringList.stream().toArray();
		for (Object object : arr) {
			System.out.println(object);
		}
		
	}

}
