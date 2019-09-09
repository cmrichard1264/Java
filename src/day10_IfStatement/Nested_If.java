package day10_IfStatement;

public class Nested_If {
	public static void main(String[] args) {

		int grade = -150;

		    if (grade >= 60 && grade <= 100) {
			System.out.println("You are passed!");
			
			if (grade >= 90 && grade <= 100) {
				System.out.println("\twith a grade A");
			} 
			else if (grade >= 80 && grade < 90) {
				System.out.println("\twith a grade B");
			}
			else if (grade >= 70 && grade < 80) {
				System.out.println("\twith a grade C");
			}
			else if (grade >= 60 && grade < 70) {
				System.out.println("\twith a grade D");
			}
		    }

		
		
		{if (grade >= 0 && grade <= 59) 
			System.out.println("You are failed!");
		
		 if (grade >= 50 && grade < 60) {
			System.out.println("\twith a grade E");
		} 
		else if (grade >= 40 && grade < 50) {
			System.out.println("\twith a grade F");
		} 
		else if (grade >= 30 && grade < 40) {
			System.out.println("\twith a grade G");
		}
		else if (grade >= 20 && grade < 30) {
			System.out.println("\twith a grade H");
		} 
		else if (grade >= 10 && grade < 20) {
			System.out.println("\twith a grade I");
		} 
		else if (grade >= 0 && grade < 10) {
			System.out.println("\twith a grade J");
		}
		
	
		else {
			System.out.println("Invalid grade");
		}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	

