package day33_ArrayList;

public class MethodCalls {
   
	public static void main(String[] args) {
		method1();
		int max2 = max( 10, 20);//20
		System.out.println(max2);
		
		int max3 = max(100, 200, 300);//300
		System.out.println(max3);
		
		int max4 = max(150,250,350,450);//450
		System.out.println(max4);
		
		maximum(1000, 2000, 3000);//3000
		
		String str = print(10, 20, 30);//30
		System.out.println(str);//900
		
		int max5 = max(150, 25, 50, 75, 100);//150
		System.out.println(max5);
	}
	
	
	
	public static void method1() {
		System.out.println("A");
	}
	
	public static void method2() {
		method1();
		System.out.println("B");
	}
	
	public static void method3() {
		method2();
		System.out.println("C");
		
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int max (int a, int b, int c) {

		int largestNum = max(a, b);
		return (largestNum > c) ? largestNum : c;
	}
	
	public static int max(int a, int b, int c, int d) {
		/*int result = max(a,b,c);
		if(result > d) {
			return result;
		}
		return d;
	}*/
	return max(	max(a,b) , max(c,d)   );
	}
	
	public static void maximum(int a, int b, int c) {
	System.out.println(max(a, b, c) );
	}
	
	public static String print (int a, int b, int c) {
		maximum(a, b, c);
		return "900";
	}
	
	public static int max(int a, int b, int c, int d, int e) {
		return max (max(a,b,c,d), e );
	}
	
}
