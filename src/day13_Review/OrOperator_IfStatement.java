package day13_Review;

public class OrOperator_IfStatement {

	public static void main(String[] args) {
		
		
		char grade = 'C';
		
		if (grade == 'A' || grade == 'B') { System.out.println("Passed");	}
		else { System.out.println("Failed");}	
		System.out.println("\n");
		
		
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("passed the exam");
			break;
				default: 
					System.out.println("failed the exam");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
