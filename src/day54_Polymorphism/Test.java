package day54_Polymorphism;

abstract class AbstractClass{
	public static void ByLinkText() {
		System.out.println("Link text super");
	}
	
	public void get() {
		System.out.println("super method");
	}
	
	
}

public class Test extends AbstractClass {
	public void get() {
		System.out.println("sub method");
	}
	
	public static void ByLinkText() {  
		System.out.println("Link text sub");
	}
	
	public static void Test() {
		System.out.println("Test method in sub class");
	}

	public static void main(String[] args) {
		//AbstractClass obj = new AbstractClass();   no object for Abstract class or Interface
		AbstractClass obj2 = new Test();
		obj2.ByLinkText();       // super class get executed/  sub class didn't Override
		obj2.get();              // sub class gets executed / method was Override
		//obj2.Test();           // method isn't exist in super class
		
		Test obj3 = new Test();
		obj3.ByLinkText();
		obj3.Test();
		
		
		
		
		
	}
}
