package method.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
/*
 * remove null values from the collection
 * print rest of the values
 */
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("cup", null, "tea", "sky", "forest", null, "book");
		
		List<String> result= words.stream().filter(w -> w!= null).collect(Collectors.toList());
		System.out.println(result);
	}

}
