package day49_Abstraction;

public class Circle extends Shape {

	double radius;
	final double PI = 3.14;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	protected void Area() {
		System.out.println("Area of the circle is: " + (radius * radius * PI));
	}
	
	protected void perimeter() {
		System.out.println("Perimeter of the circle is : " + (PI * radius * 2));
	}
}
