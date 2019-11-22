package day39_JavaReview;

public class CellPhone {
	String brand;
	double price;
	String color;
	double screenSize;
	String model;
	
	
	
	
	public CellPhone() {
		brand = "iPhone";
		price = 799.99;
		color = "gold";
		screenSize = 5.8;
		model = "XS";
	}
	
	public CellPhone(String brand, double price, String color, double screenSize, String model) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.screenSize = screenSize;
		this.model = model;
	}
	
	
	
	public void call(long phoneNumber){
		System.out.println(brand+" "+model+" is calling "+phoneNumber);
		}
	
	public void sendMessage(long phoneNumber) {
	System.out.println("Sending messages to "+phoneNumber);
	}
	
	
	public void getInfo() {
		System.out.println(brand + " "+model+" "+color+" "+screenSize+" $"+price);
	}
	
	
	
	
}
