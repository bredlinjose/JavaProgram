package program.java;

import java.util.Scanner;

/*
 * The factorial of a number is the product of all positive integers less than or equal to that number. 
 * It's denoted by an exclamation mark (!) after the number. 
 * For example, the factorial of 5 (written as 5!) is 5 * 4 * 3 * 2 * 1 = 120. 
 */
public class Factorial {

	private static int printFactorial(int num) {
		int fact=1;
		for(int i= num; i>=1; i--) {
			fact*=i;
		}
		return fact;
	}

	private static int recFact(int num) {
		if (num == 0) {
			return 1;
		}else {
			return num * recFact(num-1);
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number= sc.nextInt();
		
		System.out.println(printFactorial(number));
		
		System.out.println(recFact(number));

	}

}
