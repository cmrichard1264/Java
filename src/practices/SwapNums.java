package practices;

public class SwapNums {
	
	
	public static void main(String[] args) {
		/*//solution 01
		int a = 10;   //20
		int b = 20;   //10
		
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20
		
		System.out.println(a+" "+b);*/
		
		//solution 2   XOR (Bitwise exclusive OR)    ^
		int a = 5;
		int b = 10;
		a = a^b; //10
		b = a^b; //20
		a = a^b; //30
		
		
		
		
		System.out.println(a+" "+b);
		
		
		
	}

}
