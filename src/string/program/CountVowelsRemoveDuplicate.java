package string.program;

import java.util.HashSet;

public class CountVowelsRemoveDuplicate {

	public static void main(String[] args) {
		String str="Testing";
		String s=str.toLowerCase();
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		int count=0;
		for(Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
