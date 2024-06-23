package other.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		List<String> animalList = Arrays.asList("elephant", "lion", "tiger", "bear");
		List<String> birdList = Arrays.asList("peacock", "crow", "parrot");
		
		Stream<String> stream1 = animalList.stream();
		Stream<String> stream2 = birdList.stream();
		
		List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(list);

	}

}
