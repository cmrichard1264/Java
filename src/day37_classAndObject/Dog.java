package day37_classAndObject;

public class Dog {

	String breed;
	String size;
	byte age;
	String color;
	String name;
	char gender;
	String food;
	
	public void getInfo() {
		System.out.println(size +" "+color+" "+breed+" "+name+", "+gender +", "+ age+" years old");
	}
	
	public void eat() {
		System.out.println(name+" is eating "+ food);
	}
	
	
	public void play() {
		System.out.println(breed+ " is playing");
	}
	
	
	
	
	
}
