package oops.polymorphism;

class Addition {
	
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}

public class MethodOverloading {
	public static void main(String args[]) {

		Addition add = new Addition();
		add.sum(20, 20);
		add.sum(20, 20, 20);

	}
}
