package day49_Abstraction;

public class Shape {

	protected void Area (){
		System.out.println("Area is 0");
	}
	
	protected void perimeter() {
		System.out.println("Perimeter is 0");
	}
	
	protected void capacity() {
		System.out.println("Volume is 0");
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.Area();
		rectangle.perimeter();
		
		Rectangle rectangle2 = new Rectangle(15, 30);
		rectangle2.Area();
		rectangle2.perimeter();
		
		Square square = new Square(15);
		square.Area();
		square.perimeter();
		
		Circle circle = new Circle(7);
		circle.Area();
		circle.perimeter();
		
		Cylinder cylinder = new Cylinder(5, 10);
		cylinder.Area();
		cylinder.perimeter();
		cylinder.capacity();
		
		
	}
}
