package program.java;

import java.util.Scanner;

public class ArmstrongNumber {
//a number that equals the sum of its digits, each raised to a power
//0 to 9, 153, 370, 371, 407, ......
	private static String isArmstrong(int num) {
		int temp = num;
		int digits = (int) (Math.log10(temp) + 1);
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
