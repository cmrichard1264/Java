package day13_Review;

public class SwitchStatement {
public static void main(String[] args) {
	
	//example 1
	
	int num = 5;
	
	switch (num) {
	case 7:
		System.out.println("Sunday");
	break;
	
	case 5:
		System.out.println("Friday");
		
	
	default:
		System.out.println("Invalid Entry");
		
		
	
	}
	System.out.println("\n");
	
	
	
	
	//example 2
	
	String days = "Friday";
	
	switch (days) {	 
	
	
	default: System.out.println("Invalid");
	break;
	
	case "Tuesday": System.out.println("Tuesday is a great day");
	break;
	
	case "Monday": System.out.println("Monday is fun day");
	break;
	
	case "Wednesday": System.out.println("Wednesday is a day off");
	break;
	
	}
	System.out.println("\n");
	
	
	long n = 10;
	//switch (n) {}
	
	float n1 = 100; //100.0
	//switch(n2) {}
	
	double n3 = 10;
	//switch(n3) {}
	
	boolean n4 = true;
	//switch(n4) {}
	
	char ch = 'A';
	switch (ch) {}
	
	char ch2 = 123;
	switch (ch2) {}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
