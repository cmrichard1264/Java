package day41_initializerBlocks;

public class instanceBlock {

	
	{
		System.out.println("instance block");
	}
	
	{
		System.out.println("instance block2");
	}
	{
		System.out.println("instance block3");
	}
	
	public instanceBlock() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		instanceBlock obj = new instanceBlock();
		instanceBlock obj2 = new instanceBlock();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
