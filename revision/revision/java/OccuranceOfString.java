package revision.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOfString {

	public static void main(String[] args) {
		occuranceOfString("This is my is this is name is bredlin");

	}
	public static void occuranceOfString(String str) {
		str=str.toLowerCase();
		String[] arr = str.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		for (String strg : set) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if (strg.equals(arr[i])) {
					count++;
				}
			}
			System.out.println("Occurance of String "+strg+" is "+count);
		}
		
		
	}

}
