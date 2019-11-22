package day17_StringClass;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
			System.out.println(" Enter first and last name");
			String firstName = scan.nextLine();
			String lastName = scan.nextLine();
			String fullName = firstName+" "+lastName;
			int num = fullName.length();
			
		   System.out.println(fullName.length());
	     	int lastIndexNum = fullName.length()-1;
		   System.out.println(fullName.charAt(lastIndexNum));
		
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
