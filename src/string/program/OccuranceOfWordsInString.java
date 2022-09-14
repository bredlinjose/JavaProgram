package string.program;

import java.util.LinkedHashSet;

public class OccuranceOfWordsInString {

	public static void main(String[] args) {
		String s="welcome to bangaluru and welcome to testyantra";
		String []sp=s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<sp.length;i++)
		{
			set.add(sp[i]);
		}
		for(String word : set) {
			for(int i=0;i<sp.length;i++) {
				if(sp[i].equals(word)) {
					System.out.println(word+" "+(i+1));
					break;
				}
			}
			
		}
		
	}

}
