package oops.inheritance;

//Superclass
class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

//Subclasses
class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle();
		Shape shape2 = new Circle();

		shape1.draw();
		shape2.draw();
	}
}