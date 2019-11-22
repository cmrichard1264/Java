package day40_staticKeyWord;

public class staticVariables {

	static String name;
	static double staticNum;
	
	public static void main(String[] args) {
		staticVariables obj1 = new staticVariables();
		obj1.name = "Madina";
		
		staticVariables obj2 = new staticVariables();
		obj2.name = "Suna";
		System.out.println(obj2.name);
		
		staticVariables object1 = new staticVariables();
		
		object1.staticNum = 4.5;
		System.out.println(object1.staticNum);
		
		staticVariables object2 = new staticVariables();
		object2.staticNum = 5.5;
		
		System.out.println(object2.staticNum);
		System.out.println(object1.staticNum);
		
		
		
		
	}
}
