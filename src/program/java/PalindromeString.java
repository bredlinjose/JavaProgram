package program.java;

import java.util.Scanner;

public class PalindromeString {
	
	private static String isPalindrome(String str) {
		String rev= "";
		for (int i = str.length()-1; i >=0 ; i--) {
			char ch = str.charAt(i);
			rev=rev+ch;	
		}
		System.out.println(rev);
		
		if(str.equals(rev))
			return "Palindrome";
		else
			return "Not a Palindrome";
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println(isPalindrome(str));

	}
}
