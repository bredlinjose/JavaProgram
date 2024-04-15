package program.java;

import java.util.Scanner;

public class FibanocciSeries {

	private static void printFibanocci(int num) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2+" ");
		
		for (int i = 2; i < num; i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1= n2;
			n2=n3;
		}	
	}
	
	private static int fibRecursion(int count) {
		if(count==0)
			return 0;
		if(count==1 || count==2)
			return 1;
		
		return fibRecursion(count-1)+ fibRecursion(count-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		printFibanocci(number);
		
		System.out.println("\nFibanocci Series using Recursion");
		for (int i = 0; i < number; i++) {
			System.out.print(fibRecursion(i)+" ");
		}
		

	}

}
