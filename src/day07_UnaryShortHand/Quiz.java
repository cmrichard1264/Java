package day07_UnaryShortHand;

public class Quiz {

	public static void main(String[] args) {
		
		
		System.out.print("Result A" + 0+1);
		               // Result A
		               // Result A 01
		
		
		
		System.out.print("; Result B"+ 1+2+"\n");
		                //; Result B12 
		
		System.out.print("Result B"+ (1+2));
		
		System.out.println("    ");
		
		System.out.println("5+2="+3+4);
		System.out.println("5+2="+(3+4));
		
		float FloatNum = 100.987f;
		long ShortNum = (byte) FloatNum;
		System.out.println(ShortNum);
		
		
		
		System.out.println((3+2)*2/3%2);
		
		//int num1= 9, num2=0, num3= num1/num2;
		
	//	System.out.println(num3);
		
		
		long a = 3_000L;
		double b = (float)a;
		int c = (short)b;
		System.out.println(c%1000);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
