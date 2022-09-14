package string.program;

import java.util.LinkedHashSet;

public class DuplicateWordInString {

	public static void main(String[] args) {
		String s="this is is test yantra"; //o/p this is test yantra
		String[] str=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String string : set) {
			System.out.print(string+" ");
		}
	}

}
