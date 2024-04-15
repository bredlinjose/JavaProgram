package program.java;

import java.util.Scanner;

public class Factorial {

	private static int printFactorial(int num) {
		int fact=1;
		for(int i= num; i>=1; i--) {
			fact*=i;
		}
		return fact;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number= sc.nextInt();
		System.out.println(printFactorial(number));

	}

}
