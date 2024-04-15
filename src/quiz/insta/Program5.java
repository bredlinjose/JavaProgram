package quiz.insta;

import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add(1,"E");
		
		System.out.println(obj);
		// [A, E, B, C, D]
	}

}
