package day57_Exeptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsClass {
	
	public static boolean isAnagram(String word1, String word2) {
		
		word1 = word1.toLowerCase().replace(" ", ""); 
		word2 = word2.toLowerCase().replace(" ", ""); 
		char[] arr1 = word1.toCharArray();   
		char[] arr2 = word2.toCharArray();   
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(char each : arr1) {
			for(char each2: arr2) {
				if(each == each2) {
					return true;
				}
			}
		}
		return false;
		
		
		
		
		
		
		
		
		
	}
	 
	
	
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Suna", "Suna"));
	}
	
	
}
		
	                           
	
	


