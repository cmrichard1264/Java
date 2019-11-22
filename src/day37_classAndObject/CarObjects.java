package day37_classAndObject;

public class CarObjects {
public static void main(String[] args) {
	
	
	Car car1 = new Car();
	car1.brand = "BMW";
	car1.color = "white";
	car1.mileage = 1000;
	car1.model = "X5";
	car1.price = 14999.9;
	car1.year = 2000;
	
	System.out.println(car1.brand);
	System.out.println(car1.color);
	System.out.println(car1.mileage);
	System.out.println(car1.model);
	System.out.println(car1.price);
	System.out.println(car1.year);
	System.out.println("=========");
	
	
	
	Car car2 = new Car();
	car2.brand = "Toyota";
	car2.color = "blue";
	car2.mileage = 65000;
	car2.model = "Prius";
	car2.price = 12999.9;
	car2.year = 2013;
	
	System.out.println(car2.brand);
	System.out.println(car2.year);
	
	car1.drive();
	car2.drive();
	
	car2.getInfo();
	
	car1.start();
	
	Car car3 = new Car();
	car3.brand = "Lexus";
	car3.model = "RX 350";
	car3.color = "gold";
	car3.mileage = 0;
	car3.year = 2020;
	car3.price = 59000;
	car3.getInfo();
	
	
	
}
}
