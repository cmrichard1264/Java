package day32_MethodsReview;

public class WrapperClassReview {

	public static void main(String[] args) {
		
		
		int a = 10;
		Integer a2 = 10;
		byte c = 20;
		
		long d = a2;
		
		boolean result = 9 > 0+1;
		Boolean result2 = result;
		
		
		//parse methods
		short s1 = Short.parseShort("1234");
		System.out.println(s1+1); //1235
		
		double d1 = Double.parseDouble("78.5");
		Double d2 = Double.parseDouble("78.5");
		
		boolean r1 = Boolean.parseBoolean("true");
		
		System.out.println(r1);
		
		//ValueOg method
		Integer num = Integer.valueOf("1000");
		System.out.println(num+1);
		
		int num2 = Integer.valueOf("500");
		System.out.println(num2/5);
		
		
		
		
		
		
		
		
	}
}
