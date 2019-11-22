package day49_Abstraction;

public class Cylinder  {

	double radius;
	double height;
	final double PI = 3.14;
	double diameter;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
		diameter = radius *2;
	}
	
	protected void Area() {
		double Area = (PI * diameter * radius) + (height * PI * diameter);
		System.out.println("Area of the Cylinder is: "+Area);
	}
	
	protected void perimeter() {
		double perimeter = 2 * (PI * diameter * height);
		System.out.println("Perimeter of the cylinder is: "+perimeter);
		}
	
	protected void capacity() {
		System.out.println("Volume is 0");
	}
	
}
