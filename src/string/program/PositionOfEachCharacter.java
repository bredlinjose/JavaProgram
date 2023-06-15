package string.program;

import java.util.LinkedHashSet;

public class PositionOfEachCharacter {
	public static void main(String[] args) {
		firstPosition("tester");
		System.out.println();
		lastPosition("tester");
		
	}
	
	public static void firstPosition(String s) {
		//o/p t=1 e=2 s=3 r=6
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}	
		}
	}
	public static void lastPosition(String s1) {
		//o/p t=4 e=5 s=3 r=6
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set1.add(s1.charAt(i));
		}
		for (Character ch1 : set1) {
			for (int i = s1.length()-1; i >=0; i--) {
				if(ch1==s1.charAt(i)) {
					System.out.println(ch1+" is in "+(i+1)+" position");
					break;
				}	
			}
		}
	}
}
