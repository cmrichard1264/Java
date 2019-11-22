package day07_UnaryShortHand;

public class UnaryOperators {

	
	public static void main(String[] args) {
		
		
		
		//pre increment
		
		int num1 = 100;
	
		System.out.println(num1);
		System.out.println(++num1);
		
		int num2 = ++num1;
		System.out.println(num2);
		
		// post increment
		
		int IntNum = 100;
		System.out.println(IntNum++);
		System.out.println(IntNum);
		
		
		int IntNum2=IntNum++;
		System.out.println(IntNum2);
		System.out.println(IntNum);
		
		
		int x =100;
		int y = x++ - 1;
		System.out.println(y);
		System.out.println(x);
		
		
		
		// decrement
		int A = 100;
		System.out.println(-- A);
		
		int B = 100;
		System.out.println(B --);
		System.out.println(B);
		
		
		int P = 50;
		P= --P + P++ + P-- + P++;
		// 49    49    50    49
		
		System.out.println(P);
		
		System.out.println(P);
		
		
		short S= 4;
		int R = S*4-S--;
		System.out.println(R);
		
		
		
		
		
		
		
		int a = 13;
		int b = 7;
		int c = --b + a-- - a++ + (b-- - ++a); //
		//        6   13
		System.out.println(c);
		
		
		
		
	}
	
	
}
