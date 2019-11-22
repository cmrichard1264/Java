package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoop_MultiplyCalculator {
public static void main(String[] args) {
	
	while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first numbers");
		double a = scan.nextInt();
		System.out.println("Enter + or - or * or /");
		String calc = scan.next();
		System.out.println("Enter your second number");
		double b = scan.nextInt();
		
		if(calc.equals("+")){
		System.out.println("Addition is: "+(a+b));
		}
		else if(calc.equals("-")) {
			System.out.println("Substraction is: "+(a-b));
		}
		else if(calc.equals("*")) {
			System.out.println("Multiplication is: "+(a*b));
		}
		else if(calc.equals("/")) {
			System.out.println("Division is: "+(a/b));
		}
		else if(calc.equals("%")) {
			System.out.println("Remainder is: "+(a%b));
		}
		//else ("Invalid entry");
		
		
	
		System.out.println("Do you want to continue?");
		String answer =scan.next();
		
		
		while(!(answer.equals("yes") || answer.equals("no"))) {
			System.out.println("Invalid Entry please re enter");
			System.out.println("Do you want to continue?");
			answer = scan.next();
		}

		if(answer.equalsIgnoreCase("no")) {
			break;
		}
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
