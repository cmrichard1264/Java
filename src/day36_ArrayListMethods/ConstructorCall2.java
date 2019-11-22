package day36_ArrayListMethods;

public class ConstructorCall2 {

	public ConstructorCall2() {
		System.out.println("a");
	}
	
	public ConstructorCall2(boolean a) {
		this();
		System.out.println("b");
	}
	
	
	public static void main(String[] args) {
		ConstructorCall2 obj = new ConstructorCall2(5>3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
