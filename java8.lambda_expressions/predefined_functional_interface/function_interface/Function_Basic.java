package predefined_functional_interface.function_interface;

import java.util.function.Function;

/* Function Interface 
 * Predefined Functional Interface
 * contains apply() which accept any type as parameter and return single value of any type
 * if you want pass some type as argument and some value to return will go for this
 * Function<T,R> apply()
 */
public class Function_Basic {

	public static void main(String[] args) {
		// Function<Parameter, ReturnType>
		
		// Ex1: Square of the given number
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(5));
		
		//Ex2: Find the length of the string
		Function<String, Integer> fn = s->s.length();
		System.out.println(fn.apply("Welcome"));

	}

}
