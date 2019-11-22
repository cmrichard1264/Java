package day43_JavaRecap;

public class EncapsulationShortCut {

	public static String name = "Ava";
	
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("instance");
	}
	
	EncapsulationShortCut(){
		System.out.println("lego");
	}
	
	
	
	public static void main(String[] args) {
		EncapsulationShortCut obj = new EncapsulationShortCut();
		System.out.println("main");
	}
	
	
}
