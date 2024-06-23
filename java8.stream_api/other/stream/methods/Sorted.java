package other.stream.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		// sorted()
		List<Integer> ascending = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(ascending);
		
		List<Integer> descending = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descending);
		
		List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");
		
		List<String> sortedList = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<String> reverseSort = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSort);
	}

}
