package day41_initializerBlocks;

public class Static_VS_Instance_VS_Constructor {

	static {
		System.out.println("static block");
	}
	
	
	{
		System.out.println("instance block");
	}
	
	
	public Static_VS_Instance_VS_Constructor() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		Static_VS_Instance_VS_Constructor obj = new Static_VS_Instance_VS_Constructor();
		Static_VS_Instance_VS_Constructor obj2 = new Static_VS_Instance_VS_Constructor();
			System.out.println("main method");
		
	}
	
	
	
	
	
	
}
