package training;

import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(876);
		l.add(22);
		l.add(980);
		l.add(213);
		l.add(877);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			
		}
		System.out.println("-------------------");
		
		System.out.println(l.pollFirst()); // poll() will remove the data
		System.out.println(l.pollLast());
		System.out.println(l);
	}

}
