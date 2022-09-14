package string.program;

import java.util.LinkedHashSet;

public class CountOfRepeatedWords {

	public static void main(String[] args) {
		String str = "this is is test yantra";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		for (String string : set) {
			int count = 0;
			for (int i = 0; i < s.length; i++) {

				if (s[i].equals(string)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(string + " " + count);
			}
		}
	}

}
