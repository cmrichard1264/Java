package day06_ArithmaticOperators;

public class PrimitivesCasting {

	
	
	/*
	 casting: converting larger primitive to smaller size
	 
	 
	 
	 
	 */
	
	

	
	public static void main(String[] args) {
		
		
		// explicit casting:
		
		
		int a = 100;
		byte b = (byte) a; // explicit casting
		
		System.out.println(b);
		
		double DecimalNumber = 10.5;
		float FloatNumber = (float) DecimalNumber;
				
		System.out.println(FloatNumber);		
		
		
		long LongNum = 300L;		
		int IntNum = (short) LongNum;
		
		System.out.println(IntNum);
		
		double LargeNum = 125.8765;
		byte ByteValue = (byte) LargeNum;
		
		System.out.println(ByteValue);
		
		
		float FloatValue = (float) LargeNum;
		
		System.out.println(FloatValue);
		
		
		float FloatNumber2 = 500.67f;
		int IntNumber = (short) FloatNumber2;
		System.out.println(IntNumber);
		
		
				
		
		// implicit casting:
		
		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		
		System.out.println(IntNum2);
		
		short ShortNum = 100;
		long longNum = ShortNum;
		
		System.out.println(longNum);
		
		
	/*	
		int Num1=100;
		int Num2=200;
		int Num3=300;
		*/

	//	int Num1=100, Num2=200, Num3=300;
		
		boolean result= true;
		System.out.println(result);
		
		char Character= 'A';
		System.out.println(Character);
		
	//	boolean result1, result2, result3; // no value assigned
		
		
		// %:
		
		/*
		10/3 ==> 3 with remainder of 1
		12/5 ==> 2 with remainder of 2
			
		 */
		
		int result1 = 10%3; //1
		System.out.println(result1);
		System.out.println(12%5);
		System.out.println(6-3*2+7-1);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
