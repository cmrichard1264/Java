package day10_IfStatement;

public class multiBranch_IfStatement {

	public static void main(String[] args) {
		
		/*
		 if-else if-else:
		 if(condition1){  
		 code                  // if condition1 is true
		 }
		 else if (condition2){
		 code                  // if condition2 is true (cond1 is false)
		 }
		 else{
		 code                  // if condition3 is true (cond1 & cond2 are false)
		 }
		 */
		
		if (false) {
			System.out.println("if block");
		}
		else if(false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		System.out.println("\n");
		
		/*
		 90 <= grade ==> A
		 80 <= grade < 90 ==> B
		 70 <= grade < 80 ==> C
		 60 <= grade < 70 ==> D
		 else ==> F
		 */
		
		
		int grade = 101;
		
		if (grade>= 90 && grade <= 100) {
			System.out.println("You got A, Exellent");
		}
		else if(grade < 90 && grade >=80) {
			System.out.println("You got B, Good");
		}
		else if (grade < 80 && grade >=70) {
			System.out.println("You got C, Fine");
		}
		
		else if (grade < 70 && grade >= 60) {
			System.out.println("You got D");
		}
		
		else {
			System.out.println("You got F, Failed");
		}
		
		
		System.out.println("\n");
		
		double hour = 12.05;
		if (hour >=0 && hour <=11.59) {
			System.out.println("Good morning!");
		}
		else if (hour > 12.00 && hour <= 14.59) {
			System.out.println("Good afternoon!");
		}
		else if (hour > 15.00 && hour <= 22.59) {
			System.out.println("Good night!");
		}
		
		else {
			System.out.println("Noon!");
		}
		
		
		
		
	}
}
