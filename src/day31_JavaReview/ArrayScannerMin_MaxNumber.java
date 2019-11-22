package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerMin_MaxNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int number = scan.nextInt();
		int[] arr = new int[number];
		
		
		for(int i = 0; i < number; i++) {
		System.out.println("Enter a number: ");
		arr[i] = scan.nextInt(); 
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Minimum value is: "+ arr[0]);
		System.out.println("Maximim value is: "+arr[arr.length-1]);
		
		
		
		
	}
}
