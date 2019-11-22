package day29_ReturnMethods;

import java.util.Arrays;






public class Return_IntArray {
	
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		array = sort(array);
		System.out.println(Arrays.toString(array) );
		
	}
	
	




	public static int[] sort (int[] arr) {
		Arrays.sort(arr);
		int[] numbers = new int[arr.length];
		int z = 0;
		for(int i = arr.length-1; i >= 0; i-- ) {
			numbers[z] = arr[i];
			z++;
		}
		return numbers;
	}
	
	
}
