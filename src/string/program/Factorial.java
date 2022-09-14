package string.program;

public class Factorial {

	public static void main(String[] args) {
		int n=5; //5*4*3*2*1=120
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
