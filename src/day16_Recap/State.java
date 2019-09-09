package day16_Recap;

import java.util.Scanner;

public class State {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your zip code");
		int zipcode = input.nextInt();
		// 123456 Enter
		input.nextLine(); // takes out the Enter
		System.out.println("Please enter your city name");
		String cityname = input.nextLine();

		System.out.println("Enter your phone number");
		int pn = input.nextInt();
		// 3456 Enter
		input.nextLine();
		System.out.println("Enter state name");
		String stateName = input.nextLine();

		System.out.println(zipcode);
		System.out.println(cityname);
		System.out.println(cityname);
		System.out.println(stateName);

	}
}
