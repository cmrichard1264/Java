package home_work;

public class Nested_If {
public static void main(String[] args) {
	
	// grade
	
	int grade = 30;
	
	if (grade >= 0 && grade <= 100) {
	if (grade >= 60) { 
		if (grade >= 90) { 
			System.out.println("A");
		}
		else if(grade >= 80) {
			System.out.println("B");
		}
		else if (grade >=70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	    }
		
	    else {
		System.out.println("Failed");
	    }
		
	}
	else {
		System.out.println("Invalid Entry");
	}
		
	System.out.println("\n\n");
	
	
	
	
	
	
	
	
	
	
	
    // equal
	
	int a = 10;
	int b = 10;
	int c = 10;

	if(a==b && b == c) {
		System.out.println("all are equal");
	}
	else {
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else if (a == c) {
			System.out.println(" a nad c are equal");
		}
		else if (b == c) {
			System.out.println("b and c are equal");
		}
		else {
			
		System.out.println("none of them are equal");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
