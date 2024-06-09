package oops.abstraction;

//Create an interface called Shape.
interface Shape1 {
	void draw();
}

//Create concrete classes that implement the Shape interface.
class Circle1 implements Shape1 {
	@Override
	public void draw() {
		System.out.println("Drawing a circle...");
	}
}

class Rectangle1 implements Shape1 {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle...");
	}
}

//Create a main class to test the Shape interface.
public class Abstraction1 {
	public static void main(String[] args) {
		
		// Create an array of Shape objects.
		Shape1[] shapes = new Shape1[] { new Circle1(), new Rectangle1() };

		// Draw each shape.
		for (Shape1 shape : shapes) {
			shape.draw();
		}
	}
}
