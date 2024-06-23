package other.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethods {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","one");
		
		// findAny() --> find any
		Optional<String> ele = list.stream().findAny();
		System.out.println(ele.get()); //one
		
//		List<String> emptyList = Arrays.asList();
//		Optional<String> ele1 = emptyList.stream().findAny();
//		System.out.println(ele1.get()); // NoSuchElementException
		
		// findFirst() --> 1st element
		Optional<String> eleme = list.stream().findFirst();
		System.out.println(eleme.get());

	}

}
