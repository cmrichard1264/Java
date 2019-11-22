package day50_Abstraction;

public class Zoo {
	
public static void main(String[] args) {
	
	Cat cat = new Cat('F', (byte) 12, "Multi", "Dashka");
   /* System.out.println("Name is: "+cat.nickname);
    System.out.println("Gender is: "+ cat.gender);
    System.out.println("Color is: "+ cat.color);
    System.out.println("Age is: "+ cat.age);*/

    cat.getInfo();

    Cat cat2 = new Cat('M', (byte)5, "Red", "Murzik");
    cat2.getInfo();
    cat2.sleep(14);
    cat2.eat("fish");
    cat2.speak("russian");
    cat2.drink("valerianka");
    
    Dog dog = new Dog('M', (byte)12, "Chocolate", "Kingsley");
    dog.getInfo();
    dog.sleep(16);
    dog.eat("dog food");
    dog.speak("dog english");
    dog.drink("water");
    
    Dog dog2 = new Dog('F', (byte)2, "White/Black", "Luna");
    dog2.getInfo();
    dog2.sleep(16);
    dog2.eat("bones");
    dog2.speak("dog russian");
    dog2.drink("water");
    
    
    Dog [] dogs = {dog, dog2};
    Cat[] cats = {cat, cat2};
}
}
