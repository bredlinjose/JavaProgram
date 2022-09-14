package string.program;

import java.util.LinkedHashSet;

public class DuplicatesInOrder {

	public static void main(String[] args) {
		String s="ababbacabba";
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.print(ch+" ");
				}	
			}
		}
	}

}
