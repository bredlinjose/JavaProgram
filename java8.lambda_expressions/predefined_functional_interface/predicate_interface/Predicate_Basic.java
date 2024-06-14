package predefined_functional_interface.predicate_interface;

import java.util.function.Predicate;

/* Predicate Interface 
 * Predefined Functional Interface
 * contains test() which accept single argument and return boolean value
 * if you have conditional check then we go for this 
 * Predicate<T> test()
 */
public class Predicate_Basic {

	public static void main(String[] args) {
		
		// Ex1: Check whether the given number is greater than 20
		//Predicate<Integer> p = (i)->(i>20); // one argument so no need to mention parenthesis
		Predicate<Integer> p1 = i->(i>20);
		System.out.println(p1.test(10)); //false
		System.out.println(p1.test(30)); //true
		
		// Ex2: Check the length of given string is greater than 4 or not
		Predicate<String> p2 = str->(str.length()>4);
		System.out.println(p2.test("welcome")); //true
		System.out.println(p2.test("hii")); //false
		
		// Ex3: print array elements whose size is greater than 4
		String [] names= {"David","Smith","John","Mary","Joe"};
		Predicate<String> p3 = str->(str.length()>4);
		for (String name : names) {
			if (p3.test(name)) {
				System.out.println(name);
			}
		}
		

	}

}
