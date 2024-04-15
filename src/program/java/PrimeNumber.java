package program.java;

import java.util.Scanner;

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
