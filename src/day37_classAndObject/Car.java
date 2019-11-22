package day37_classAndObject;

public class Car {

	
	String model;
	int year;
	String color;
	double price;
	long mileage;
	String brand;
	
	public void drive () {
		System.out.println("Driving "+brand);
	}
	
	public void start (){
		System.out.println(brand+" is statring");
	}

	public void getInfo() {
		System.out.println(year+" "+brand+" "+model+", "+ color+", "+ mileage+" miles, "+"$"+price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
