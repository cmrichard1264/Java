package day37_classAndObject;

public class DogObjects {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 11;
		dog1.breed = "lab";
		dog1.color = "chocolate";
		dog1.gender = 'M';
		dog1.name = "Kingsley";
		dog1.size = "Large";
		dog1.food = "kfc";
		System.out.println(dog1.breed);
		
		dog1.getInfo();
		
		Dog dog2 = new Dog();
		dog2.breed = "alabay";
		dog2.age = 2;
		dog2.color = "white";
		dog2.gender = 'F';
		dog2.name = "Luna";
		dog2.size = "Extra large";
		dog2.food = "sushi";
		
		dog2.getInfo();
		
		dog2.eat();
		dog1.eat();
		dog1.play();
		
		
	}
}
