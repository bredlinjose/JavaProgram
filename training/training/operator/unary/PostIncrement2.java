package training.operator.unary;

public class PostIncrement2 {

	public static void main(String[] args) {
		int a=10;
		int b=a++;
		int c=b++;
		int d=a++;
		System.out.println("Value of a is "+a); //12
		System.out.println("Value of b is "+b); //11
		System.out.println("Value of c is "+c); //10
		System.out.println("Value of d is "+d); //11

	}

}
