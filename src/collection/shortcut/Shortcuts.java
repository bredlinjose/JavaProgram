package collection.shortcut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Shortcuts {
	private static Integer[] convert_intArray_to_IntegerArray(int[] intArray) {
		// Using IntStream.of()
		Integer[] integerArray = IntStream.of(intArray).boxed().toArray(Integer[]::new);
		
//		// Using Arrays.stream()
//		 Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
		
		return integerArray;
	}
	
	public static void array_to_list(String[] arrName, int[] arr) {
		// Using Arrays.asList() --> Only for string values
		List<String> nameList1 = new ArrayList<>(Arrays.asList(arrName));
		List<String> nameList2 = new LinkedList<>(Arrays.asList(arrName));
		
		System.out.println("ArrayList: " + nameList1);
		System.out.println("LinkedList:" + nameList2);
		
		
		// Using IntStream and boxed() --> Only for integer values
		List<Integer> arrayList = IntStream.of(arr).boxed().collect(Collectors.toList()); // by default -- return as ArrayList
		List<Integer> linkedList = IntStream.of(arr).boxed().collect(Collectors.toCollection(LinkedList::new)); // return as LinkedList
		
		System.out.println("ArrayList: " + arrayList);
		System.out.println("LinkedList: " + linkedList);
		
		// Only for string value
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
        Collections.addAll(list1, arrName);
        Collections.addAll(list2, arrName);
        
        System.out.println("ArrayList: " + list1);
		System.out.println("LinkedList: " + list2);
		
		
		// Collections.addAll() is not possible for List<Integer>
		
	}
	
	public static void array_to_set(String[] arrName, int[] arr) {
		// Using Arrays.asList() --> Only for string values
		Set<String> nameSet1 = new HashSet<>(Arrays.asList(arrName));
		Set<String> nameSet2 = new LinkedHashSet<>(Arrays.asList(arrName));
		
		System.out.println("HashSet: " + nameSet1);
		System.out.println("LinkedHashSet:" + nameSet2);
		
		
		// Using IntStream and boxed() --> Only for integer values
		Set<Integer> hashSet = IntStream.of(arr).boxed().collect(Collectors.toSet()); // by default -- return as HashSet
		Set<Integer> linkedHashSet = IntStream.of(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new)); // return as LinkedHashSet
		
		System.out.println("HashSet: " + hashSet );
		System.out.println("LinkedHashSet: " + linkedHashSet );
		
		// Only for String value
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new LinkedHashSet<>();
        Collections.addAll(set1, arrName);
        Collections.addAll(set2, arrName);
        
        System.out.println("HashSet: " + set1);
		System.out.println("LinkedHashSet: " + set2);
        
        // Collections.addAll() is possible only for the Integer[] not int[] --> Only for integer values
        Integer[] integerArray = convert_intArray_to_IntegerArray(arr);
        Set<Integer> set3 = new HashSet<>();
		Set<Integer> set4 = new LinkedHashSet<>();
        Collections.addAll(set3, integerArray);
        Collections.addAll(set4, integerArray);
        
        System.out.println("HashSet: " + set3);
		System.out.println("LinkedHashSet: " + set4);
		
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7};
		
		String[] arrName = {"Bredlin", "Jose", "Joe", "Bre", "Lee", "Bre", "Lee"};
		
		array_to_list(arrName, arr);
		
		array_to_set(arrName, arr);
		
	}

}
