package com.assignment.java;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num =121;
		int temp = num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
			
	}

}
