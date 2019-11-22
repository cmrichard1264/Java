package day29_ReturnMethods;

public class ReturnMethods {
	
	public static void main(String[] args) {
		name();
		System.out.println(name());
		String str = name();
		System.out.println(str);
	}

	public static void method1() {
		System.out.println("Hello");
	}
	
	public static String name() {
		return "Batch12";
		
	}
	
	public static boolean result() {
		return true;
	}
	
	
	
}
