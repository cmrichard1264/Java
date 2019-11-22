package practices;

public class Numbers_SwapNumbers {

	public static void main(String[] args) {
		
		//solution 1:
		
	/*	int a = 10;
		int b = 20;
		
		a = a+b; 
		 //10+20=30
		
		b = a-b; 
		 //30-20=10
		
		a = a-b;
		  //30-10=20
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);*/
		
		
		
	//	Bitwise XOR Operation
		//solution 2: Exclusive OR (XOR)
		int a =10;  
		int b =20;
		a = a^b;    //a 30
		a = a^b;    //b 10
	    a = a^b;    //a 20
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
