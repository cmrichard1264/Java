package day21_WhileLoops;

import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	while (true) {
	
	System.out.println("Please enter first number");
	int num1 = scan.nextInt();
	System.out.println("enter your second number");
	int num2 = scan.nextInt();
	
	System.out.println("addition is: "+ (num1+num2));
	
	
	
	System.out.println("Do you want to continue?");
	String answer = scan.next();
	
	if(answer.equalsIgnoreCase("no")) {
		break;
	}
	else if(answer.equalsIgnoreCase("yes")) {
		break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
