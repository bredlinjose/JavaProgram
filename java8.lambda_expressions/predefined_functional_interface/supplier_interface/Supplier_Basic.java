package predefined_functional_interface.supplier_interface;

import java.util.Date;
import java.util.function.Supplier;

/* Supplier Interface 
 * Predefined Functional Interface
 * which does not accept any parameter and it will return something (similar to without argument and with return type)
 * contains get()
 * Supplier<R> get()
 */
public class Supplier_Basic {

	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
