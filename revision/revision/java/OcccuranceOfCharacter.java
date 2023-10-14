package revision.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class OcccuranceOfCharacter {
	public static void main(String[] args) {
		occuranceOfChar("abbcccddddeeeee");
	}
	
	public static void occuranceOfChar(String name) {
		char[] arr = name.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if (ch==arr[i]) {
					count++;
				}
			}
			System.out.println("Occurance of "+ch+" is "+count);
		}	
	}

}
