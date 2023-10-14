package training.oops.polymorphism;

class Test{
	public void m1() {
		System.out.println("Test Method");
	}
}

class Sample extends Test{
	public void m1() {
		System.out.println("Sample Method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		Sample sample = new Sample();
		sample.m1();
		
		Test obj = new Sample();
		obj.m1();
		
		
	}

}
