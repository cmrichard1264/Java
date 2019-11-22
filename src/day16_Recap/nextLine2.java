package day16_Recap;

import java.util.Scanner;

public class nextLine2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your zipcode:");
		int zip = input.nextInt();
		
		input.nextLine();
		System.out.println("Please enter your city name:");
		String city = input.nextLine();
		
		
		System.out.println("Enter your phone number:");
		int phone = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter your state name:");
		String state = input.nextLine();
		
		System.out.println(zip);
		System.out.println(city);
		System.out.println(phone);
		System.out.println(state);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
