package day33_ArrayList;

import java.util.Arrays;

public class OverloadingMethods_DescendingOrder {

	public static void main(String[] args) {
		
		int [] arr = { 20, 50, 70, 80, 90};
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
		
		double [] arr2 = { 10.5, 27.5, 35.5, 52};
		arr2 = sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		char [] arr3 = {'C', 'V', 'D', 'A'};
		arr3 = sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4 = {"Madina", "Adrien", "Charlotte"};
		arr4 = sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
	}
	
	
	
	
    //write a return method that accepts an int array and sorts it in descending order
        public static int [] sort (int[] arr) {
		Arrays.sort(arr);
		int[] arr2 = new int[arr.length];
		int j = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			//arr2[i] =arr[arr.length-(i+1)];
			j++;
		}
		
		
		return arr2;
	}
	
	
	
	// write a return method that accepts a double array and sorts it in descending order
        public static double[] sort(double[] arr) {
		Arrays.sort(arr);
		double[] arr2 = new double[arr.length];
		int j = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			//arr2[i] =arr[arr.length-(i+1)];
			j++;
		}
		
		
		return arr2;
	}
	
	
	 //  write a return method that accepts a char array and sorts it in descending order
        public static char[] sort(char[] arr) {
        Arrays.sort(arr);
		char[] arr2 = new char[arr.length];
		int j = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			//arr2[i] =arr[arr.length-(i+1)];
			j++;
		}
		
		
		return arr2;
	}
	
	
     //   write a return method that accepts a String array and sorts it in descending order
	    public static String[] sort(String[] arr) {
		Arrays.sort(arr);
		String[] arr2 = new String[arr.length];
		int j = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			//arr2[i] =arr[arr.length-(i+1)];
			j++;
		}
		
		
		return arr2;
	}
	
	
	
	
	
	
	
	
	
}
