package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		double n1 = input.nextDouble();
		
		System.out.println("Enter your second number");
		double n2 = input.nextDouble();
		
		System.out.println("Enter your third number");
		double n3 = input.nextDouble();
		
		double Largest = (n1>n2 && n1>n3)? n1
				:(n2>n1 && n2>n3)? n2
				:n3;
						
		
		System.out.println("Largest number is: "+ Largest);
		
		
		
		
		
		
		
		
		
		
	}
}
