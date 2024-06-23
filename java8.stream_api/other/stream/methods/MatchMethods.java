package other.stream.methods;

import java.util.HashSet;
import java.util.Set;

public class MatchMethods {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<String>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More graphes");
		fruits.add("Two guavas");
		
		// anyMatch() --> atleast 1 match
		boolean res1 = fruits.stream().anyMatch(value ->{ return value.startsWith("One");});
		System.out.println(res1);
		
		// allMatch --> all needs to match
		boolean res2 = fruits.stream().allMatch(value ->{ return value.startsWith("One");});
		System.out.println(res2);
		
		//noneMatch() --> none of the elements need to match
		boolean res3 = fruits.stream().noneMatch(value ->{ return value.startsWith("One");});
		System.out.println(res3);
		

	}

}
