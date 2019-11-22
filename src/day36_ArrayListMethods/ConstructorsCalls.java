package day36_ArrayListMethods;

public class ConstructorsCalls {

	public ConstructorsCalls() {
		System.out.println("A");
	}
	
	public ConstructorsCalls(int a) {
		this();
		System.out.println("B");
	}
	
	public ConstructorsCalls(double a) {
		this(10);
		System.out.println("C");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorsCalls obj = new ConstructorsCalls(10.5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
