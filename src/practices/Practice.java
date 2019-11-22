package practices;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	
		String a = "abc";
		String b = "cab";
		
		char[] char1 = a.toCharArray();
		char[] char2 = b.toCharArray();
		
		String a1="";
		String a2="";
		
		for(char each: char1) {
			a1 += each;
			}
		
		for(char each: char2) {
			a2 += each;
		}
		
			System.out.println(a1.equals(a2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}