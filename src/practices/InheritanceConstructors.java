package practices;

class A{
	String name = "Madina";

	public A(String lastName) {
		System.out.println("A constructor");
	}
}


class B extends A{

	public B(String lastName) {
		super(lastName);
		
	}

	
	
}
public class InheritanceConstructors {

	public static void main(String[] args) {
		B obj = new B(null);
		
		
	}
}
