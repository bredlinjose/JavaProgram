package training.stringclass;

public class Example {

	public static void main(String[] args) {
		
		String s1 ="hello";
		
		System.out.println("Length of string is "+s1.length());
				
		System.out.println("Index of l is "+s1.indexOf('l'));
		
		System.out.println("Index of l from the 3rd index is "+s1.indexOf('l',3)); // will not return the index value of the same char before the index mentioned
		
		System.out.println("2nd charater is "+s1.charAt(2));
		
		System.out.println("Substring of string from index 2 is "+s1.substring(2)); // including index
		
		System.out.println("Substring of string from index 0 to 3 is "+s1.substring(0,3)); // excluding to index
		
		String s2 ="Hello";
		
		System.out.println("Is string1 and string2 is equal? "+s1.equals(s2));
		
		System.out.println("Is string1 and string2 is equal ignore case? "+s1.equalsIgnoreCase(s2));

		System.out.println("Concat "+s2.concat(s1));
		
		
		
		
	}

}
