package program.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		int count=0;
		for (int i = 1; i <= num/2; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==1) {
			System.out.println(num+" is Prime Number");
		}else {
			System.out.println(num+" is not Prime Number");
		}
	}
}
