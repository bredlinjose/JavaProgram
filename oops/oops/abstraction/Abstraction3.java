package oops.abstraction;

//concept of Abstraction 
abstract class Shape3 {
	String color;

	// abstract class can have the constructor
	public Shape3(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// these are abstract methods
		abstract double area();
		public abstract String toString();
		
	// this is a concrete method
	public String getColor() {
		return color;
	}
}

class Circle3 extends Shape3 {
	double radius;

	public Circle3(String color, double radius) {

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor() + " and area is : " + area();
	}
}

class Rectangle3 extends Shape3 {

	double length;
	double width;

	public Rectangle3(String color, double length, double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}
}

public class Abstraction3 {
	public static void main(String[] args) {
		Shape3 s1 = new Circle3("Red", 2.2);
		Shape3 s2 = new Rectangle3("Yellow", 2, 4);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
