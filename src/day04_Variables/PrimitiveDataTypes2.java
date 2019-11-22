package day04_Variables;

public class PrimitiveDataTypes2 {

	/*
	 byte,short, int, long, float, double, boolean, char
	 
	 boolean: 
	 */
	
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result1 = false;
		boolean result2 = 9 > 3;
		//boolean reslult3 = Earth is flat; 
		//boolean num1 = 100;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	
		
		//char:
		
		char char1 = 'a';
		
		System.out.println(char1);
		
		//char char2 = 'ab';   only a single character
		
	    char char2 = '9';
	    char char3 = '#';
	     System.out.println(char2);
	     System.out.println(char3);
	
		//char with numbers
	     char char4 = 67; // prints letter "C" from ASCII table
	     
	     System.out.println(char4);
	     
	     char char5 = '{';
	     System.out.println(char5);
	     
	     char char6 = 123;
	     System.out.println(char6);
	     
	     // initializing char tp other primitives;
	     
	     System.out.println("\n");
	     
	     
	     char MyChar1 = 'b';
	     
	     int MyInt = 'b';
	     
	     System.out.println(MyChar1);
	     System.out.println(MyInt);
	     
	     
	     
	     
	   //  byte MyByte = MyChar1; // char's memory is 2 bytes, byte's memory is 1 byte
	     
	     byte MyByte2 = 'b';
	     System.out.println(MyByte2);
	     
	     short ShortNum = 'b';
	     System.out.println(ShortNum);
	     
	     long LongNum = MyChar1; // lons's memory is 8 bytes
	     long LongNum1 = 'b'; //98
	     System.out.println(LongNum);
	     System.out.println(LongNum1);
	     System.out.println("\n");
	     
	     
	     float floatNum = MyChar1;
	     float floatNum1 = 'b';
	     System.out.println(floatNum1);
		
	    double doubleNum = MyChar1;
	    double doubleNum1 = 'b';
	    System.out.println(doubleNum1);
	    
	    char mycharValue = 2222;
	    System.out.println(mycharValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
