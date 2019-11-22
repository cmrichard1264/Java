package day54_Polymorphism;

public class SwapInt {
	
	public static void main(String[] args) {
		//solution #1
		/*int a = 10;
		int b = 20;
		
		a = a+b; // 30
		b = a-b; //10
		a = a-b; //20
		System.out.println(a);
		System.out.println(b);*/
		
		
		//solution #2  XOR(extender OR)
		int a = 10;
		int b = 20;
		
		a = a^b;   //30
		b = a^b;   //10
		a = a^b;   //20
		System.out.println(a+ " "+ b);
	}

}
