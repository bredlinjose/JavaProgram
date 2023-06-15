package string.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOfString {
	static String word = "welcome to bangalore and welcome to office";

	public static void main(String[] args) {
		occuranceOfWord();
		occuranceOfLetter();

	}

	public static void occuranceOfWord() {
		Set<String> set = new LinkedHashSet<String>();
		String[] arr = word.split(" ");
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (String string : set) {
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				if (string.contains(arr[i])) {
					num = num + 1;
				}
			}
			System.out.println(string + "=" + num); // o/p welcome=2 to=2 bangalore=1....
			
			
		}
	}

	public static void occuranceOfLetter() {
		String word1 = word.replace(" ", "");
		Set<Character> set = new LinkedHashSet<Character>();
		char[] ch = word1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for (char chara : set) {
			int num = 0;
			for (int i = 0; i < ch.length; i++) {
				if (chara==ch[i]) {
					num = num + 1;
				}
			}
			System.out.println(chara + " " + num);
		}
	}

}
