package training.oops.inheritance;

public class Inheritance_SingleLevel {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parent();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		
		Child c = new Child();
		c.child();
		c.parent();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");

	}
}

class Parent{
	public void parent() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void child() {
		System.out.println("Child");
	}
}
