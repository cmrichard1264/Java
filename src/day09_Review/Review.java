package day09_Review;

public class Review {

	public static void main(String[] args) {
		
		
		// > >=
		
		System.out.println('A' > 'B'); // false ASCII
		System.out.println('Z' > 'A' ); //true ASCII
		System.out.println( 'a' >= 'A'); // true ASCII
		
		
		// < <=
		
		System.out.println( 'a' < 'A'); // false
		System.out.println( 10 <= 15); // true
		
		// ==
		
		System.out.println(10 == 10); // true
		System.out.println(10 == 100); //false
		
		// !=
		
		System.out.println(10 != 10); //false
		System.out.println(10 != 100); // true

		
		// &&
		
		System.out.println( true==true && false != true); // true
		
		// ||
		
		System.out.println(true != true || false == true); //false
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
