package basic.lambda_expressions;

@FunctionalInterface // optional
interface Cab2 {

	public void bookCab(String source, String destination);

}

public class Lambda2 {
	
	public static void main(String[] args) {
		
		Cab2 cab = (source, destination)->System.out.println("Ola cab is booked from "+source+" to "+destination);
		cab.bookCab("Bangalore","Chennai");
	}
	
}
