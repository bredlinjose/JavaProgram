package oops.abstraction;

//Define an interface named Shape 
interface Shape2 {
	double calculateArea(); // Abstract method for
							// calculating the area
}

//Implement the interface in a class named Circle 
class Circle2 implements Shape2 {
	private double radius;

	// Constructor for Circle
	public Circle2(double radius) {
		this.radius = radius;
	}

	// Implementing the abstract method from the Shape
	// interface
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//Implement the interface in a class named Rectangle 
class Rectangle2 implements Shape2 {
	private double length;
	private double width;

	// Constructor for Rectangle
	public Rectangle2(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Implementing the abstract method from the Shape
	// interface
	public double calculateArea() {
		return length * width;
	}
}

//Main class to test the program 
public class Abstraction2 {
	public static void main(String[] args) {
		// Creating instances of Circle and Rectangle
		Circle2 myCircle = new Circle2(5.0);
		Rectangle2 myRectangle = new Rectangle2(4.0, 6.0);

		// Calculating and printing the areas
		System.out.println("Area of Circle: " + myCircle.calculateArea());
		System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
	}
}
