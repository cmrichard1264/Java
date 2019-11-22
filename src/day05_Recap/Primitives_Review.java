package day05_Recap;

public class Primitives_Review {

	public static void main(String[] args) {
		
		byte bNum = 127;
		// byte range: -128 to 127
		
		// byte bNum2= 126.5;  // byte only takes whole numbers
		
		short sNum2 = 1000;
		// short sNum = 126.5; // short only takes whole numbers
		// bNum2 = sNum; // short is greater than byte
		
		sNum2 = bNum; // sNum2= 127;
		System.out.println(sNum2);
		
		int intNum = 100;
	//	byte ByteNum = intNum; //int >b byte
	//  short ShortNum = intNum; // int> short
		
		System.out.println(intNum);
		
		short ShortNum2 = 105;
		intNum = ShortNum2;
		
		System.out.println(intNum);
		
		long LongNum = 100l;
		long LongNum2 = 100L;
		
	//	byte ByteNum3 = LongNum; 
    //    short ShortNum = 100l;
    //    int IntNum3 = 100L;
		
		byte a =10;
		int b = 30;
		short c = 40;
		
		long LongNumber = a;
		long LongNumber2 = b;
		long LongNumber3 = c;
		
		
		// float:
		
		float floatNumber = 10.5f;
		float floatNumber2 = 20.5F;
		System.out.println(floatNumber2);
		
		short a1 = 10; byte b1=20; long c1=30; int d1=40;
		
		float Floats = a1;
		float Floats2 = b1;
		float Floats3= c1;
		float Floats4= d1;
		
		System.out.println(Floats);
		
		// duoble:
		
		double DoubleNum1 = 10L;
		
		double DoubleNum2 = 10.5F;
		
		System.out.println(DoubleNum2);
		
		
		// boolean:
		
		boolean result = true;
		boolean result2 = false;
		
		//char
		
		char character1 = 'A'; // must have single quotes
		System.out.println(character1); // character: A
		
		char charvalue = 98;
		System.out.println(charvalue);
		
		
		int num3 = 'B'; //66
		System.out.println(num3);
		
		float num4 = 'B'; //66.0
		System.out.println(num4);
		
		byte num5 = 'B';
		System.out.println(num5);
		
		short num6 = 'B';
		System.out.println(num6);
		
		//float:
		float num7 = 5.5f;
		System.out.println(num7);
		
		float num8 = 5;
		System.out.println(num8);
		
		
		
		// practices:
		
	char character = 33;
	System.out.println(character);
	
		
		
	}
	
	
	
	
}
