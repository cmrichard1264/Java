package day32_MethodsReview;

public class CustomMethodsReview {

	public static void main(String[] args) {
		
		method1();
		evenNum();
		revStr("Madina");
	    byte num =(byte)largestNum(10, 20);
	    System.out.println(num);
	    
	   String name =  reverse("Hazim");
	   System.out.println(name);
	}
	
	
	
	//method1
	public static void method1() {
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Batch");
	}
	
	//method2
	public static void evenNum () {
		for(int i = 1; i <=50; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i+" ");
			
		}System.out.println();
	}
	
	//method3
	public static void revStr(String str) {
		for (int i= str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}System.out.println();
	}
	
	
	
	//method4
	public static void print(String str) {
		System.out.println(str);
		return;
	}
	
	
	//returnMethod
	public static int largestNum(int a, int b) {
		int max = (a>b) ? a:b;
		return max;
	}
	
	
	//returnMethod
	public static String reverse(String str) {
		String result = "";
		for (int i= str.length()-1; i >= 0; i--) {
			result += ""+str.charAt(i);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
