package day29_ReturnMethods;

public class SystemExit {

	public static void main(String[] args) {
		method1();
		System.out.println(number());
		System.out.println("Done");
	}
	
	public static void method1() {
		System.out.println("Hello world");
		System.exit(0);
	}
	
	
	
	
	public static int number() {
		if(true) {
			System.exit(0);
		}
		return 5;
	}
}
