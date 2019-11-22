package day29_ReturnMethods;

import java.util.Arrays;

public class OverloadingMethod {

	
	public static void main(String[] args) {
		int result = sum( 10, 20);
		System.out.println(result);
		System.out.println(sum(50, 100, 150));
		System.out.println(sum(10.5 ,20.5));
		int[] arr = { 1,2,3,4,5};
		sort(arr);
	    char [] ch = {'a', 'b', 'c'};
	    sort(ch);
	    String[] str = { "A", "B", "C", "D"};
	    sort(str);
		
		
		
		
	}
	
	
	
	
	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static int sum (int a, int b, int c) {
		return a+b+c;
	}
	
	public static double sum (double a, double b) {
		return a+b;
	}
	
	public static void sort (int[] arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void sort (char[] arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
	public static void sort(String[] arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
}
