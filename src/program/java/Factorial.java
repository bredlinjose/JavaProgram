package program.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// n1*n2*n3*.....*nx
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		int fact=1;
		for (int i = 1; i <= num; i++) {
			fact =fact*i;
		}
		System.out.println(fact);
	}

}
