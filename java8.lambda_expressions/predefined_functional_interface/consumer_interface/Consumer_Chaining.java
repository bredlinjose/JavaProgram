package predefined_functional_interface.consumer_interface;

import java.util.function.Consumer;

/*
 * Consumer Chaining
 * andThen()
 */
public class Consumer_Chaining {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println(s+ " is White");
		
		Consumer<String> c2 = s -> System.out.println(s+ " is have 4 legs");
		
		Consumer<String> c3 = s -> System.out.println(s+ " is eating grass");
		
		c1.andThen(c2).andThen(c3).accept("Cow");;
		
		Consumer<String> c4 = s -> c1.andThen(c2).andThen(c3);
		
		c4.accept("Goat");
		

	}

}
