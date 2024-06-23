package method.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo1 {

	public static void main(String[] args) {
		// map()
		List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> num2 = num1.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(num2);

		// flatmap()
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> combList = Arrays.asList(list1, list2, list3);

		List<Integer> finalList = new ArrayList<Integer>();
		finalList = combList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(finalList);
		
		finalList = combList.stream().flatMap(x -> x.stream()).map(n -> n+10).collect(Collectors.toList());
		System.out.println(finalList);
		

	}

}
