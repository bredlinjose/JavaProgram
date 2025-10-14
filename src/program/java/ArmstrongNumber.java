package program.java;

import java.util.Scanner;

/*
 * An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. 
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. 
 */
public class ArmstrongNumber {
	
	private static String isArmstrong(int num) {
		int temp = num;
		int digits = (int) (Math.log10(temp) + 1);
//		int digits = String.valueOf(num).length();
		int sum = 0;

		while (temp > 0) {
			int last = temp % 10;
			sum += Math.pow(last, digits);
			temp /= 10;
 
		}

		if (num == sum)
			return "Armstrong Number";
		else
			return "Not an Armstrong Number";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println(isArmstrong(number));

	}

}
