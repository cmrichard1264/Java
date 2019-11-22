package day41_initializerBlocks;

public class instanceBlockPractice {

	public String name = "Madina";
	public instanceBlockPractice(){
		this(10);
		name = "Mira";
	}
	
	{
		name = "Suna";
	}
	{
		name = "Aysel";
	}
	public instanceBlockPractice(int a) {
		name = "Muhtar";
	}
	
	
	
	
	public static void main(String[] args) {
		instanceBlockPractice obj = new instanceBlockPractice();
		obj.name = "Sherinay";
		System.out.println(obj.name);
		instanceBlockPractice obj2 = new instanceBlockPractice();
		System.out.println(obj2.name);
		
	}
}
