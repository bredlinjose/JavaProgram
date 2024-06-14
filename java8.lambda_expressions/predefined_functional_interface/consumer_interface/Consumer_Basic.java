package predefined_functional_interface.consumer_interface;

import java.util.function.Consumer;

/* Consumer Interface 
 * Predefined Functional Interface
 * which accept one parameter and it wont return anything (similar to non parameterized void method)
 * contains accept()
 * Consumer<T> accept() 
 */
public class Consumer_Basic {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Welcome");
	}

}
