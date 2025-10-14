package program.java;

import java.util.Scanner;

/*
 * A prime number is a whole number greater than 1 that has only two divisors: 1 and the number itself. 
 * In simpler terms, it's a number that can't be divided evenly by any other whole number except for 1 and itself. 
 * Examples: 2, 3, 5, 7, 11, 13, 17, 19, and so on. 
 */
public class PrimeNumber {
	
	private static String isPrimeNumber(int num) {
		int count =0;
		for(int i=1; i<=num/2; i++) {
			if(num%i==0)
				count++;
		}
		if (count==1)
			return "Prime Number";
		else
			return "Not a Prime Number";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(isPrimeNumber(number));

	}

}
