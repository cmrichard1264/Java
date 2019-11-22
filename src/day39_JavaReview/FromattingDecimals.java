package day39_JavaReview;

import java.text.DecimalFormat;

public class FromattingDecimals {

	public static void main(String[] args) {
		DecimalFormat name = new DecimalFormat("0.00");
		double b = 23.12558484848484848;
		
		String num1 = name.format(b);
		System.out.println(num1);
		
		double c = 45.24885;
		System.out.println(name.format(c));
		
		c = Double.parseDouble(name.format(c));
		System.out.println(c+10);
		
		
		
		
	}
}
