package day23_Arrays;

import java.util.Scanner;

public class DivisionCalculatorWithOutDivisionSign {
	public static void main(String[] args) {

		// division calculator without "/"

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = 0;
		if (num1 != 0 && num2 != 0) {
			while (num1 >= num2) {

				num1 -= num2;
				result++;
			}
			System.out.println(result);
			System.out.println(num1);
		} else {
			System.out.println("Invalid entry");

		}

	}
}
