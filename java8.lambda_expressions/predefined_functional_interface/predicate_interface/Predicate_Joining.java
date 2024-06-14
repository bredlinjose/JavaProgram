package predefined_functional_interface.predicate_interface;

import java.util.function.Predicate;



/* Joining Predicates -and, or, negate
 * and, or, negate
 * 
 */

public class Predicate_Joining {

	public static void main(String[] args) {
		
		int [] arr = {5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
		
		// p1 -->  checks number is even
		Predicate<Integer> p1 = i->i%2==0;
		// p2 --> checks number is greater then 50
		Predicate<Integer> p2 = i->i>50;
		
		//and --> both condition needs to satisfy
		System.out.println("Following numbers are Even AND Greater than 50");
		for (int n : arr) {
			if(p1.and(p2).test(n)) {   //if(p1.test(n) && p2.test(n)) 
				System.out.println(n);
			}		
		}
		
		//or --> any one condition needs to satisfy
		System.out.println("Following numbers are Even OR Greater than 50");
		for (int n : arr) {
			if(p1.or(p2).test(n)) {   //if(p1.test(n) && p2.test(n)) 
				System.out.println(n);
			}	
		}
		
		//negate --> opposite(if i/p:true, o/p:false and if i/p:false, o/p:true)
		System.out.println("Following numbers are NOT Even");
		for (int n : arr) {
			if (p1.negate().test(n)) {
				System.out.println(n);
			}
		}
	}

}
