package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice {
	
public static void main(String[] args) {
	addition(10,20);
	System.out.println(addition(10, 20));
	int num = addition(10, 20);
	System.out.println(num);
	
	
	int max = (int)greaterNum(90, 20, 30);
	System.out.println(max);
	
	
	int[] arr = {20, 50, 1, 2, 3, 5, 9};
	int maxNum = maximum(arr);
	System.out.println(maxNum);
	
	int[] arr2 = {1000, 90000, 826696, 1618941, 616651};
	int maxNum2 = maximum(arr2);
	System.out.println(maxNum2);
}
	
	
	public static int addition(int a , int b) {
		return a+b;
		
	}
	
	
	public static double greaterNum(int a, int b, int c) {
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	public static int maximum (int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	
	
	
	
	
	
}
