package day49_Abstraction;

public class Rectangle extends Shape {

	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	protected void Area() {
		System.out.println("Area of rectangle is: " + (length * width));

	}
	
	@Override
	protected void perimeter() {
		System.out.println("Perimeter of rectangle is: "+ (length * 2 + width *2));
		System.out.println("********************************");
	}
}
