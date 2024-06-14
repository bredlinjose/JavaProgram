package basic.lambda_expressions;

@FunctionalInterface // optional
interface Cab3 {

	public String bookCab(String source, String destination);

}

/* class Ola3 implements Cab3{

	public String bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from "+source+" to "+destination);
		return "Price: Rs.5000";
	}
	
} */

public class Lambda3 {
	
	public static void main(String[] args) {
		
		Cab3 cab = (source, destination)->{ System.out.println("Ola cab is booked from "+source+" to "+destination);
			return "Price: Rs.5000";
		};
		System.out.println(cab.bookCab("Bangalore","Chennai"));
	;
	}
	
}
