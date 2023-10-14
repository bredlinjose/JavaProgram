package revision.java;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharUsingMap {

	public static void main(String[] args) {
		occuranceOfCharUsingMap("bredlin jose bredlin");

	}
	public static void occuranceOfCharUsingMap(String s) {
		char[] ch = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			} else {
				map.put(ch[i], 1);
			}
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry);
		}
	}

}
