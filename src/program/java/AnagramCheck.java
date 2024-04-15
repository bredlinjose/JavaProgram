package program.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    private static String isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return "Not Anagram";
        }

        char[] ch1= str1.toCharArray();
		char[] ch2= str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
			return "Anagram";
		else
			return "Not an Anagram";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String s1= sc.nextLine();
		System.out.println("Enter the 2nd String: ");
		String s2= sc.nextLine();
		
		System.out.println(isAnagram(s1, s2));
		

	}
}

