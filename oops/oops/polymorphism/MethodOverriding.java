package oops.polymorphism;

class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Shape shape = new Circle();
		shape.draw(); // Prints "Drawing a circle"

		shape = new Rectangle();
		shape.draw(); // Prints "Drawing a rectangle"

		shape = new Triangle();
		shape.draw(); // Prints "Drawing a triangle"
	}
}
