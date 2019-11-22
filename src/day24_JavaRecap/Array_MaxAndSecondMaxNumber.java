package day24_JavaRecap;

public class Array_MaxAndSecondMaxNumber {

	public static void main(String[] args) {
		
		
		// 1. write a program that can return the maximum value from an int array
		   
		
		
		int[] array = {10, 20, 30, 40, 50, 60, 70};
		
		int max = 0;
		
		for (int i = 0; i< array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum number is: "+max);
		
		
		
		//2. write a program that can return the second maximum value from an int array
		
		int secondMax = 0;
		for (int j = 0; j< array.length; j++) {
			if(array[j] > secondMax && array[j] < max) { //or!=max
				secondMax = array[j];
			}
		}
		System.out.println("Second maximum number is: "+secondMax);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
