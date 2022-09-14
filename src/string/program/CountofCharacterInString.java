package string.program;

import java.util.LinkedHashSet;

public class CountofCharacterInString 
{

	public static void main(String[] args) 
	{
		String str="Bredlin Jose";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}

	}

}
