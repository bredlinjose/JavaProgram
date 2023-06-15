package com.java;

public class ChainingUsingThis {

	ChainingUsingThis() {
		System.out.println("Constructor without Parameters");
	}

	ChainingUsingThis(int a) {
		this();
		System.out.println("Constructor with 1 Parameters");
	}
	
	ChainingUsingThis(int a, String b) {
		this(a);
		System.out.println("Constructor with 2 Parameters");
	}

	public static void main(String[] args) {
		ChainingUsingThis chaining = new ChainingUsingThis(10, "Bredlin");
		System.out.println("Main method");
	}

}
/* -- Output --
 * Constructor without Parameters 
 * Constructor with 1 Parameters 
 * Constructor with 2 Parameters 
 * Main method
 */