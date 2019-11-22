package day45_Inheritance;

public class Protected_VS_Default {
   public static void main(String[] args) {
	
}
	protected static String name;
	static String name2;
	
	
	
	protected static void printHello() {
		System.out.println("Hello");
	}
	
	void printHola() {
		System.out.println("Hola");
	}
	
}

class cybertek{
	public static void main(String[] args) {
		Protected_VS_Default obj = new Protected_VS_Default();
		obj.printHello();
		obj.printHola();
		System.out.println(obj.name);
		System.out.println(obj.name2);
	}
}
