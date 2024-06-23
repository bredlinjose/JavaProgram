package method.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
/*
 * read element and multiply by 3
 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5);
		List<Integer> multipliedList = new ArrayList<Integer>();
		
		multipliedList= list.stream().map(num -> num*3).collect(Collectors.toList());
		System.out.println(multipliedList);
		
		list.stream().map(num -> num*3).forEach(System.out::println);
		

	}

}
