package basic.lambda_expressions;

/**Functional Interface
 * It contains only one abstract method
 * Have multiple default method and static method
 * No need to mention @FunctionalInterface its optional
 */

@FunctionalInterface 
interface Cab {

	public void bookCab();

}

class Ola implements Cab {

	@Override
	public void bookCab() {
		System.out.println("Ola cab is booked ...");

	}

}


public class Functional_Interface {
	
	public static void main(String[] args) {
		Cab cab = new Ola();
		cab.bookCab();
		
	}
}
