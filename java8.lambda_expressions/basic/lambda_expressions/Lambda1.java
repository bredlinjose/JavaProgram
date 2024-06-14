package basic.lambda_expressions;

@FunctionalInterface 
interface Cab1 {

	public void bookCab();

}

public class Lambda1 {
	
	public static void main(String[] args) {
		
		Cab1 cab = ()->System.out.println("Ola cab is booked...");
		cab.bookCab();
	}
	
}
