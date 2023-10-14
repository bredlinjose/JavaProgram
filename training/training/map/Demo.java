package training.map;

import java.util.HashMap;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> l = new HashMap<>();
		l.put(101, "Smith");
		l.put(108, "Allen");
		l.put(105, "Adam");
		
		System.out.println(l.get(105));
		System.out.println(l.containsKey(109));
		System.out.println(l.containsValue("Adam"));
		
		Set<Integer> key = l.keySet();
		System.out.println(key);
		
		for (Integer i : key) {
			System.out.println(i+" "+l.get(i));
		}
	}

}
