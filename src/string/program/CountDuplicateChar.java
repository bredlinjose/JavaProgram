package string.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountDuplicateChar {

	public static void main(String[] args) {
		String word = "my name is bredlin jose";
		
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < word.length(); i++) {
			set.add(word.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < word.length(); i++) {
				if (ch==word.charAt(i)) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(ch +"="+count);
			}
		}
	}

}
