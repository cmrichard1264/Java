package day19_ForLoop;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your user name");
		String user = input.nextLine().toLowerCase();

		System.out.println("Enter your password");
		String pass = input.nextLine();

		String username = "cybertek.batch12@gmail.com";
		String password = "Javengers";
		if (user.endsWith("@gmail.com")) {
			if (user.equalsIgnoreCase(username) && pass.contentEquals(password)) {
				System.out.println("Loged in successfully");
			} else {
				if (!user.equalsIgnoreCase(username) && !pass.contentEquals(password)) {
					System.out.println("both username amd passowrd are in correct");
				}

				else if (user.equalsIgnoreCase(username)) {
					System.out.println("Invalid username");
				}

				else {
					System.out.println("Invalid username or password");
				}
			}
		} else {
			System.out.println("it's not a valid email address");
		}

	}
}
