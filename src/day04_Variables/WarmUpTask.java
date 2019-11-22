package day04_Variables;

public class WarmUpTask {
	
	/*
	 1. Cucumber     = 2.5 float. double
	 2. Tomato       = 3.0 
	 3. Onion        = 1.5 float, double
	 4. Green pepper = 2
	 5. Carrot       = 4
	 
	 */

	public static void main(String[] args) {
		
		// Cucumber:
		// int Cucumber = 2.5; we can only assign whole numbers to int, byte, short, long
		
	//	float Cucumber = 2.5; // float can not contain double
		float Cucumber = 2.5f;
		double Cucumber1 = 2.5f; // double can contain float
		double Cucumber2 = 2.5;
		
		
		
		//Onion: 1.5
		float Onion = 1.5f;
		double Onion1 = 1.5;
		
		//Green Pepper: 2.0
		byte Greenpepper = 2;
		short Greenpepper1 = 2;
		int Greenpepper2 = 2;
		long Greenpepper3 = 2l;
		float Greenpepper4 = 2; // only time we add f or F is when assigned decimals
		double Greenpepper5= 2; 
		
		System.out.println(Greenpepper);
		System.out.println(Greenpepper1);
		System.out.println(Greenpepper2);
		System.out.println(Greenpepper3);
		System.out.println(Greenpepper4); // double and float converts the whole numbers to decimals
		System.out.println(Greenpepper5);
		
		
		
	}
	
	
	
	
	
}
