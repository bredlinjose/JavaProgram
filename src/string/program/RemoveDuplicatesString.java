package string.program;

import java.util.LinkedHashSet;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String str="Tester";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//System.out.println(String.valueOf(set));
		
		for (Character ch : set) {
			System.out.print(ch+" ");
		}
	}

}
