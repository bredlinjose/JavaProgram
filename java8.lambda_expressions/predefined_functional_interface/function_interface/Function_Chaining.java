package predefined_functional_interface.function_interface;

import java.util.function.Function;

/*
 * Function Chaining
 * andThen(), compose()
 */
public class Function_Chaining {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = n->n*2; //double the value
		
		Function<Integer,Integer> f2 = n->n*n*n; //cube
		
		//2 will go to f1 it will double and the double value is will go to f2
		System.out.println(f1.andThen(f2).apply(2)); //2*2 = 4 ==> 4*4*4 = 64
		
		
		//reverse order 1st f2 will execute and that value is pass to f1
		System.out.println(f1.compose(f2).apply(2)); // 2*2*2 = 8 ==> 8*2 = 16
		
	}

}
