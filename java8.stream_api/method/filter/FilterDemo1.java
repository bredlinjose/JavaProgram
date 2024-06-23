package method.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	/*
	 * store even numbers in another list
	 * print even numbers
	 */
	public static void singleConditionFilter() {
		
		List<Integer> numList = Arrays.asList(10, 15, 20, 25, 30, 35);
		List<Integer> evenNumList = new ArrayList<Integer>();

		/*//without stream
		 * for (int n : numList) { 
		 * 	if (n % 2 == 0) 
		 * 		evenNumList.add(n); }
		 * 	System.out.println(evenNumList);
		 */

		// with stream
		evenNumList = numList.stream().filter(n -> n%2 == 0).collect(Collectors.toList()); // to store in another list
		System.out.println(evenNumList);
		
		numList.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));	// to print
		
		numList.stream().filter(n -> n%2 == 0).forEach(System.out::println); // to print
	}
	
	/*
	 * check the name length >6 and <8
	 */
	public static void multiConditionFilter() {
		
		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffrey");
		List<String> longNames = new ArrayList<String>();
		
		longNames = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
		System.out.println(longNames);
		
		names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str -> System.out.println(str));
		
		names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		singleConditionFilter();
		
		multiConditionFilter();
	}

}
