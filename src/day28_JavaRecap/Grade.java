package day28_JavaRecap;

public class Grade {

public static void main(String[] args) {
	CalculateGrades(80);
}



public static void CalculateGrades (double score) {
	char grade = (score >= 90 && score <= 100) ? 'A'
			:(score >= 80 && score <= 89) ? 'B'
			:(score >= 70 && score <= 79) ? 'C'		
			:(score >= 60 && score <= 69) ? 'D'		
			:(score >= 50 && score <= 59) ? 'F'		
			:'I'	;
	
				if (grade == 'I') {
					System.out.println("Invalid score");
				}else System.out.println(grade);
				
					
					
					
					
					
					
					
					
					
}





}