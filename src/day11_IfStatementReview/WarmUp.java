package day11_IfStatementReview;

public class WarmUp {
public static void main(String[] args) {
	
	int year = 2019;
	
	boolean leapyear = year % 4 == 0;
	
	if(leapyear) {
		System.out.println( "Year "+year+ " is a leap year");
	}
	else {
		System.out.println("Year "+ year + " is not a leap year");
	
	}
	
	System.out.println("\n");
	
	
	int grade = -5;
	boolean A = grade >= 90 && grade <=100;
	boolean B = grade >= 80 && grade <=89;
	boolean C = grade >= 70 && grade <=79;
	boolean D = grade >= 60 && grade <=69;
	boolean ValidGrade = grade >= 0 && grade <=100; // has to be true to be executed
	
	if(ValidGrade) {
	if(A) {
		System.out.println("You made A");
	}
	else if(B) {
		System.out.println("You made B");
	}
	else if(C) {
		System.out.println("You made C");
	}
	else if (D) {
		System.out.println("You made D");
	}
	else {
		System.out.println("You made F");
	}
	}
	
	
	else {
		System.out.println("Invalid Grade");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
