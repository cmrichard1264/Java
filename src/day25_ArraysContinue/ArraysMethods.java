package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
public static void main(String[] args) {
	
	
	int num = 10;
	System.out.println(num);
	
	int[] arr = {1,2,3};
	System.out.println(arr);
	
	String str = Arrays.toString(arr);
	System.out.println(str);
	
	
	
	String[] names = {"Elvira", "Bibish", "Daulet", "Hakan", "Tural"};
	String print = Arrays.toString(names);
	System.out.println(print);
	
	
	
	//Arrays.sort(name):  Int
	int[] numbers = {9,8,100,3000,4,5,6};
	System.out.println(Arrays.toString(numbers));
	Arrays.sort(numbers);
	System.out.println(Arrays.toString(numbers));
	System.out.println("Maximum: "+numbers[numbers.length-1]);
	System.out.println("Minimum: "+numbers[0]);
	
	
	int[] nums = {200,90,89,78,65,5555,444,-5};
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	System.out.println("Maximum: "+nums[nums.length-1]);
	System.out.println("Minimum: "+nums[0]);
	
	
	
	
	
	
	//Arrays.sort(name): String
	String[] names2 = {"Askar", "Bek", "Dos", "Sabir", "Ayana"};
	Arrays.sort(names2);
	System.out.println(Arrays.toString(names2));
	
	
	
	//Arrays.sort(name): Char
	char[] ch = {'0','9','8','5', '3','2','1'};
	Arrays.sort(ch);
	System.out.println(Arrays.toString(ch));
	
	System.out.println();
	
	
	//Arrays reversed numbers
	int[] numbers2 = { 1,2,3,4,5,6,7,8,9};

	Arrays.sort(numbers2);
	for(int i = numbers2.length-1; i>0; i--){
    System.out.print(numbers2[i]+" ");
    }
	System.out.println();
	
	
	
	
	
	int[] arr2 = { 10,20,30,40,50};
	Arrays.sort(arr2);
	int[] arr3 = new int [arr2.length];
	int z =0;
	
	for(int i = arr2.length-1; i>=0; i--) {
		arr3[z]=arr2[i];
	}
	System.out.println(Arrays.toString(arr2));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
