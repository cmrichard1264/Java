package day54_Polymorphism;


class Animal{
	public void talk() {
		System.out.println("Animal is talking");
	}
}


class Tiger extends Animal{
	public void hunt() {
		System.out.println("Tiger is hunting");
	}
	public void talk() {
		System.out.println("Tiger says: roar!");
	}
}


class Octopus extends Animal{
	public void swim() {
		System.out.println("Octopus is swimmimg");
	}
	public void talk() {
		System.out.println("Octopus says: golo-golo-golo");
	}
}


public class Zoo {
	public static void main(String[] args) {
		
		Tiger tiger1 = new Tiger();
	    Tiger[] tigers = {tiger1, new Tiger()};
	    
	    Octopus octopus1 = new Octopus();
	    Octopus[] octopus = {octopus1, new Octopus()};
	    System.out.println(octopus.length);
	    
	    Animal animal1 = new Tiger();
//     refType  refName   object	
	    animal1.talk();
	   // animal.hunt();   hunt method isn't exist in ref type
	    Animal animal2 = new Octopus();
	    animal2.talk();
	   // animal2.swim();  swim method isn.t exist in ref type

}}
