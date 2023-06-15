package string.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class VowelsInString {

	public static void main(String[] args) {
		vowelsCount();
		vowels2();
		vowels3();
		vowels4();
	}

	public static void vowelsCount() {
		String word = "bredlin jose";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels count = " + count);
	}

	public static void vowels2() {
		String word = "bredlin jose";
		int[] count = new int[5];
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a') {
				count[0]++;
			} else if (ch == 'e') {
				count[1]++;
			} else if (ch == 'i') {
				count[2]++;
			} else if (ch == 'o') {
				count[3]++;
			} else if (ch == 'u') {
				count[4]++;
			}
		}
		System.out.println("a = " + count[0]);
		System.out.println("e = " + count[1]);
		System.out.println("i = " + count[2]);
		System.out.println("o = " + count[3]);
		System.out.println("u = " + count[4]);
	}

	public static void vowels3() {
		String word = "bredlin jose";
		int[] count = new int[5];
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a') {
				map.put('a', ++count[0]);
			} else if (ch == 'e') {
				map.put('e', ++count[1]);
			} else if (ch == 'i') {
				map.put('i', ++count[2]);
			} else if (ch == 'o') {
				map.put('o', ++count[3]);
			} else if (ch == 'u') {
				map.put('u', ++count[4]);
			}
		}
		// System.out.println(map.size());
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry);
		}
	}

	public static void vowels4() {
		String str = "bredlin jose";
		LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
		hMap.put('a', 0);
		hMap.put('e', 0);
		hMap.put('i', 0);
		hMap.put('o', 0);
		hMap.put('u', 0);
		for (int i = 0; i <= str.length() - 1; i++) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			}
		}
		System.out.println(hMap);
	}
}
