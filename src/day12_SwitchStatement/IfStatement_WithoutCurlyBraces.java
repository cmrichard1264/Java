package day12_SwitchStatement;

public class IfStatement_WithoutCurlyBraces {
public static void main(String[] args) {
	
	int score = 3;
	
	
	
	if(score == 1) { // must give boolean
		System.out.println("1");
	}
	else if(score == 2) {
		System.out.println("2");
	}
	else {
		System.out.println("Invalid");
	}
	System.out.println("\n\n");
	
	
	
	
	switch(score) { // must give data
	case 1:
		System.out.println("1");
		break; //closing statement
	case 2:
		System.out.println("2");
	    
	    
	default:
	    	System.out.println("Invalid");
	}
	
	System.out.println("\n");
	
	String str = "Java";
	
	switch(str) {
	
		
		case "C#":	
		System.out.println("C# programming Language");
		break;
		case "Python":
			System.out.println("Python programming Language");
		
		default: // else
			System.out.println("Invalid");
		
	}
	System.out.println("\n");
	
	
	
	
	
	
	char grade = 'A';
	
	switch(grade) {
	
	
	    case 'A':
		System.out.println("Passed with B");
		case 'C':
		System.out.println("Passed with A");
		default :
		System.out.println("Failed");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
