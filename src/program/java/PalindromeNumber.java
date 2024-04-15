package program.java;

import java.util.Scanner;

public class PalindromeNumber {

	private static String isPalindrome(int num){
		int temp=num;
		int sum=0;
		
		while(temp>0) {
			int rem= temp%10;
			sum=(sum*10)+rem;
			temp/=10;
		}
		
		if(num==sum)
			return "Palindrome Number";
		else
			return "Not a Palindrome Number";
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(isPalindrome(number));

	}


}
