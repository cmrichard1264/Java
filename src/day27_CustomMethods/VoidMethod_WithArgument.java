package day27_CustomMethods;

public class VoidMethod_WithArgument {

	
	// access-modifier specifier return-type name(parameter){}
	
	public static void main(String[] args) {
		oddOrEven(200); // int a
		sumOfNumbers(20,20);
	}
	
	//                             200
	public static void oddOrEven(int a) {
		if(a % 2 == 0) {
			System.out.println(a+" is Even number");
		}else {
			System.out.println(a+ " is Odd number");
		}
	}
	

      public static void sumOfNumbers(int a, int b) {
    	  System.out.println(a+b);
      }























































}
