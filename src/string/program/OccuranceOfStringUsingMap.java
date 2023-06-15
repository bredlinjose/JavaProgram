package string.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfStringUsingMap {
	
	static String nameString = "bredlin bredlin jose";
	
	public static void main(String[] args) {
		occuranceOfLetter();
		occuranceOfWord();
	}
	
	public static void occuranceOfLetter() {
		char[] ch =nameString.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < nameString.length(); i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1 );
			}else {
				map.put(ch[i], 1);
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet(); //it will return all the entry set from collection
		// It will take the key and value from the map and store it in set
		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry);
		}
	}
	
	public static void occuranceOfWord() {
		String[] arr = nameString.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String name : arr) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name)+1);
			}else {
				map.put(name, 1);
			}
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println(entry);
		}
	}

}
