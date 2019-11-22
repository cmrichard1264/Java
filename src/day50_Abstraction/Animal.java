package day50_Abstraction;

public abstract class Animal {
	
public char gender;
public byte age;
public String color;
public String nickname;


public Animal(char gender, byte age, String color, String nickname) {
	this.gender = gender;
	this.age = age;
	this.color = color;
	this.nickname = nickname;
}

public abstract void speak(String language);
public abstract void eat(String food);
public abstract void sleep(int hour);
public abstract void drink(String drink);

public void getInfo() {
	System.out.println("Name is: "+nickname);
	System.out.println("Gender is: "+gender);
	System.out.println("Color is: "+color);
	System.out.println("Age is: "+age);
	System.out.println("*******************");
	
	
	
}

}
