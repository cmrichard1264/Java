package day10_IfStatement;

public class if_else_Statement {

	public static void main(String[] args) {
		
		
		/*   
		 
		 if & else:
		 
		 if (Condition) {
		 code
		 }
		 else {
		 code
		 {
		 
		 */
		
		
		
		if (9 <= 8) {
			System.out.println("9 is less or equal to 8");
		} 
		else {
			System.out.println("9 is great than 8");
		}
		
		
		
		
		if (false == !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		System.out.println("\n\n");
		
		
		
		int score = 59;
		if (score >= 60) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		if (score >= 90) {
			System.out.println("You got A+, Good Job!");
		}
		else {
			System.out.println("You could not make A+");
		}
		
		System.out.println("\n\n");
		
		
		int angle1 = 80;
		int angle2 = 60;
		int angle3 = 70;
		
		if (angle1+angle2+angle3 == 180) {
			System.out.println("Valid Triangle");
		}
		
		
		
		
		
	}
}
