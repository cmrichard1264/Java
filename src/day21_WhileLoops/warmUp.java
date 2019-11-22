package day21_WhileLoops;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		
		
		// how many "key words" in sentence
		
		
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		
		//String sentence = "I like books, i have books, i need book, i buy book";
		             //index      i+3+1==> book
		int count = 0;
		for(int i=0; i< sentence.length()-3; i++) {
			if(sentence.substring(i, i+4).equals("book")) {
				count ++;
				
				
			
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		// example2
		int count2 =0;
		String words = "Cybertek is school, Cybertek is great, i love  Cybertek";
		for (int i =0; i< words.length()-7;i++) {
			if(words.substring(i, i+8).equalsIgnoreCase("cybertek")) {
				count2++;
			}
		}
		System.out.println(count2);
		
		
		
		
		//remove dublicated values from String
		
		String s = "aaabbbcccddeecccbbb";
		String result =""; //abc
		
		
		for(int i = 0; i< s.length(); i++) {
			if(!result.contains(s.substring(i, i+1) )) {
				result += s.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
		//example 2
		
		String s2 = "abcdeabcde";
		String result2 =""; //abc
		
		
		for(int i = 0; i< s2.length(); i++) {
			if(!result2.contains(""+s2.charAt(i) )) {
				result += s.substring(i, i+1);
			}
		}
		
		System.out.println(result2);
		
		
		
		
	}
}
