package day14_Scanner;

public class Ternary {
public static void main(String[] args) {
	
	int num = 0;
	if(false) {num = 100;}
		else {num = 50;}
	System.out.println(num);
	
	
	int num1 = (false)? 100: 50;
	System.out.println(num1);
	int num2= false? 100: 50;   
	System.out.println(num2);
	
	
	
    String Schoolname = "";
    boolean Batch12 = true;
    if(Batch12) {
    	Schoolname = "Cybertek";
    }
    else {
    	Schoolname = "Invalid";
    }
	
	System.out.println(Batch12 ? "Cybertek" : "Invalid");
	
    String BestSchool = Batch12 ? "Cybertek": "Invalid";
	System.out.println(BestSchool);
	
	double d = 10;
	if (true) {
		d = 10.5;
	} System.out.println(d+"\n");

	
	
	
	double interestRate = 0;
	boolean GoodCredit = true;	
    interestRate = GoodCredit ? 0.5: 0.9;
	System.out.println(interestRate+"\n");
	
	byte grade = 60;
	boolean passed = grade >= 60 ? true: false;	
	System.out.println(passed+"\n");
	
	
	char finalGrade = 'B';
	String Group =  "";	
    Group =	(finalGrade == 'A')? "Early bird": 
    	    (finalGrade == 'B')? "Group 1": 
    		(finalGrade == 'C')? "Group 2":    	   	
         	"After Group 2";
	System.out.println(Group+"\n");
	
	int score = 110;
	char finals = ' ';
	finals =  (score >= 90 && score <=100 )? 'A'
		     :(score >= 80 && score <= 89)? 'B'
		     :(score >= 70 && score <= 79)? 'C'
		     :(score >= 60 && score <= 69)? 'D'            
		     :(score >= 0 && score <= 59)? 'F'
		     :' ';
	         System.out.println(finals+"\n");
	
	         
	int n1 = 10000, n2 = 3000, n3 = 400;	
	int max = (n1 > n2 && n1 > n3)? n1
			:(n2 > n1 && n2 > n3)? n2
			: n3;
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
