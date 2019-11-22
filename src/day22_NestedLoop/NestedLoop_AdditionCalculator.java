package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoop_AdditionCalculator {
public static void main(String[] args) {
	
	while(true) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Multiplication is: "+(a*b));
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
