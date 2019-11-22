package day29_ReturnMethods;

public class WrapperClassMethods {

	public static void main(String[] args) {
		
		
		//MAX_VALUE
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		double max2 = Double.MAX_VALUE;
		System.out.println(max2);
		
		byte max3 = Byte.MAX_VALUE;
		System.out.println(max3);
		
		char max4 = Character.MAX_VALUE;
		System.out.println(max4);
		
		
		//MIN_VALUE
		short min = Short.MIN_VALUE;
		System.out.println(min);
		
		long min2 = Long.MIN_VALUE;
		System.out.println(min2);
		
		float min3 = Float.MIN_VALUE;
		System.out.println(min3);
		
		
		//ParseMethod
		
		Integer num = Integer.parseInt("123"); //auto-boxing
		System.out.println(num);
		
		int num2 = Integer.parseInt("2019"); //none
		System.out.println(num2 + 1);
		
		
		byte num3 = Byte.parseByte("127");
		System.out.println(num3);
		
		short num4 = Short.parseShort("200"); //none
		System.out.println(num4);
		Short num5 = Short.parseShort("200"); //auto-boxing
		System.out.println(num5 + 1);
		
		int num6 = (int)Long.parseLong("1500"); //none
		long num7 = Long.parseLong("1500");
		System.out.println(num6);
		System.out.println(num7);
		
		float num8 = Float.parseFloat("12.5");//none
		System.out.println(num8);
		
		Float num10 = Float.parseFloat("12.5F");//auto-boxing
		System.out.println(num10);
		
		float num11 = (int)Double.parseDouble("8.5"); // none
		System.out.println(num11);
              
        double num12 = Double.parseDouble("8.5");
        System.out.println( num12 );
            
        Double num13 = Double.parseDouble("8.5");  // auto-boxing
        System.out.println(num13);
		
		boolean A = Boolean.parseBoolean("true");
		System.out.println(A);
		
		Boolean B = Boolean.parseBoolean("TRUE");
		System.out.println(B);
		
		int a = 10;
		double b = a;
		Double c = b; 
		
		Byte A1 = Byte.parseByte("19");
		Integer A2 = (int)Byte.parseByte("19");
		Short A3 = (short)Double.parseDouble("19");
		
		
		int z = Integer.valueOf("1234");
		Integer z1 = Integer.valueOf("12345");
		
		int totalNumber = 100;
		String str3 = ""+totalNumber; // none
		
		
		
	}
}
