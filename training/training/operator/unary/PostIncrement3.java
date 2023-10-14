package training.operator.unary;

public class PostIncrement3 {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		int c= a++ + b++;
		System.out.println(c); //30
		System.out.println(b); //21
		System.out.println(a); //11
		

	}

}
