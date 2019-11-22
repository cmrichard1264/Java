package day31_JavaReview;

import java.util.Arrays;

public class ArrayReviews {

	public static void main(String[] args) {
		
		
		//int Arrays
		int num = 10;
		int[] arr = {10};
		
		int[] arr2 = new int[2];
		
		System.out.println(""+arr2[0]+" "+arr2[1]);
		
		//String array
		String [] cars = new String[5];
		cars[0] = "Tesla";
		cars[1] = "Audi";
		cars[2] = "Toyota";
		cars[3] = "Jeep";
		cars[4] = "Subaru";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		
		//Boolean array
		
		boolean[] bool = { 10 > 9,  "Mikray".equals("Seyfo"), 10 == 10};
		boolean b1 = bool [1];
		System.out.println(b1);
		String str = Arrays.toString(bool);
		System.out.println(str);
		
		for(boolean each: bool) {
			System.out.print(each+" ");
		}
		System.out.println();
		
		//double array
		
		double[] array = {1000, 900, 800, 700, 600};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		//int array
		int[] numbers = {200, 300, 20, 7890, 40, -9, -100};
		String result = "";
		Arrays.sort(numbers);
		for(int i = numbers.length-1; i >= 0; i--) {
			result += numbers[i]+", ";
			}
		result = result.trim();
		result = result.substring(0, result.length()-1);
		System.out.print(result);
		
		
		
		
		
		
		
		
		
	}
}
