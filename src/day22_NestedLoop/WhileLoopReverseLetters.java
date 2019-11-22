package day22_NestedLoop;

import java.util.Scanner;

public class WhileLoopReverseLetters {

	public static void main(String[] args) {
		
		//reverse
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter anything you want");
		String original = scan.nextLine();
		String reverse = "";// "fedcba"
		/*
		for(int i = original.length()-1; i>=0; i--) {
			//reverse += original.substring(i, i+1);
			reverse += original.charAt(i);
		}*/
		
		int i = original.length()-1;
		while(i>=0) {
			reverse +=original.charAt(i);
			i--;
		}
		
		System.out.println("Reverse version: "+reverse);
		boolean result = original.equals(reverse)? true: false;
		System.out.println("Is it palindrome? : "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
