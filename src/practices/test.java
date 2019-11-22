package practices;

import java.util.Scanner;

public class Repl_It {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 2 numbers:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	
	    if(num1>num2) {
	    	System.out.println(num1+" is greater than "+num2);
	    }
	    else if(num2>num1) {
	    	System.out.println(num2+" is greater than "+num1);
	    }
	    else System.out.println(num1+" and "+num2+" are equal");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

		/*System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int seniorCitizens = scan.nextInt();
		int nonSeniorCitizens = scan.nextInt();

		System.out.println("What is new citizen's age?");
		int age = scan.nextInt();

		if (age >= 65) {
			System.out.println("Senior Citizen" + "\n" + "New seniorCitizens count " + (seniorCitizens + 1) + "\n"
					+ "New nonSeniorCitizens count " + nonSeniorCitizens);
		}

		if (age < 65) {
			System.out.println("Non-Senior Citizen" + "\n" + "New seniorCitizens count " + seniorCitizens + "\n"
					+ "New nonSeniorCitizens count " + (nonSeniorCitizens + 1));
		}*/

		/*
		 * System.out.println("Welcome to the Grader!"); System.out.
		 * println("Please enter subject name number 1 and score for this subject");
		 * String subject1 = scan.nextLine(); double grade1 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.
		 * println("Please enter subject name number 2 and score for this subject");
		 * String subject2 = scan.nextLine(); double grade2 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.
		 * println("Please enter subject name number 3 and score for this subject");
		 * String subject3 = scan.nextLine(); double grade3 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.
		 * println("Please enter subject name number 4 and score for this subject");
		 * String subject4 = scan.nextLine(); double grade4 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.
		 * println("Please enter subject name number 5 and score for this subject");
		 * String subject5 = scan.nextLine(); double grade5 = scan.nextDouble();
		 * 
		 * String summary = ("Summary: " + subject1 + " - " + grade1 + ", " + subject2 +
		 * " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " +
		 * grade4 + ", " + subject5 + " - " + grade5); Double average = (grade1 + grade2
		 * + grade3 + grade4 + grade5) / 5;
		 * 
		 * System.out.println(summary); System.out.println("Your average score is: " +
		 * average); System.out.println("Thank you for using Grader!");
		 * System.out.println("Goodbye!");
		 */

		/*
		 * int inputSeconds = input.nextInt(); int seconds = inputSeconds % 60; int
		 * hours = inputSeconds/60; int minutes = hours % 60; hours = hours/60;
		 * 
		 * System.out.println(hours +
		 * " hours, "+minutes+" minutes, and "+seconds+" seconds");
		 */

		/*
		 * System.out.println("Enter Item1 and its price:"); String item1 =
		 * scan.nextLine(); double price1 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.println("Enter Item2 and its price:"); String
		 * item2 = scan.nextLine(); double price2 = scan.nextDouble();
		 * 
		 * scan.nextLine(); System.out.println("Enter Item3 and its price:"); String
		 * item3 = scan.nextLine(); double price3 = scan.nextDouble();
		 * 
		 * double totalPrice = price1+price2+price3; String report =
		 * ("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "
		 * +price2+", Item3: "+item3+" Price: "+price3);
		 * 
		 * System.out.println(report); System.out.println("Total price: "+ totalPrice);
		 */

	}
}
