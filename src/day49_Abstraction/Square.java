package day49_Abstraction;

public class Square extends Shape{

	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	protected void Area() {
		System.out.println("Area of square is: "+ side*side);
	}
	
	protected void perimeter() {
		System.out.println("Perimeter of square is: "+ side * 4);
	    System.out.println("*************************");
	}
}
