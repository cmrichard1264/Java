package day18_StringClassContinue;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first and last names");
	String firstName = scan.nextLine();
	String lastName = scan.nextLine();
	
	/*String initials = firstName.substring(0, 1).concat(".")+lastName.substring(0, 1);
    initials=initials.toUpperCase();
	System.out.println(initials);*/
	
	/*char nameFirst =firstName.charAt(0);
	char lastFirst = lastName.charAt(0);
	System.out.println(nameFirst+""+lastFirst);*/
	
	String lastLetters = firstName.charAt(firstName.length()-1)+""+lastName.charAt(lastName.length()-1);
	System.out.println(lastLetters);
	
	
	
	
	
}
}
