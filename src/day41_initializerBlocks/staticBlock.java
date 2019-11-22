package day41_initializerBlocks;

public class staticBlock {

	public staticBlock() {
		System.out.println("Constructor");
	}
	
	
	
	
	
	static {
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	
	
	public static void main(String[] args) {
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		System.out.println("Main Method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
