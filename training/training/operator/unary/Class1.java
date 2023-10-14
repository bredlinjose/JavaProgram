package training.operator.unary;

public class Class1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c= 30;
		int d = a++ + ++b + ++c;
		System.out.println("Value of a is "+a); //11
		System.out.println("Value of b is "+b); //21
		System.out.println("Value of c is "+c); //31
		System.out.println("Value of d is "+d); //62

	}

}
