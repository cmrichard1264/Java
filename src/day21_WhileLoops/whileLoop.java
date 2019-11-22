package day21_WhileLoops;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		
		
		
		
		int a = 9;
		while (a > 8) {		
			
			System.out.println("Hello world "+a);
			a--;
		}
		
		
		// how many "keywords" in sentence
		
		String sentence = "I like book, i read book, book, book, book";
		int count = 0;
		while(sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book", "");// eventually condition become false
		
		}
		System.out.println(count);
		
		
		//with break
		
		while(true) {
			System.out.println("Hello");
			break;
		}
		
		    int i =0;
		    while(true) {
			i++;
			System.out.print("Hello: "+i+"  ");
			if(i== 5){
			break;
		}
		}
		System.out.println();
		
		
		
		
		    // print all even numbers
		    
		    for(int num =1; num<=50; num++) {
		    	if(num%2==0) {
		    		System.out.print(num+" ");
		    	}
		    }
		    System.out.println();
		
		//example 2
		    int num1 = 1;
		    while(num1<=50) {
		    	if(num1 % 2== 0) {
		    		System.out.print(num1+" ");
		    		
		    	}
		    	num1++;
		    }
		System.out.println();
		
		
		
		//example 3
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number");
		int start = scan.nextInt();
		
		System.out.println("ending number");
		int end = scan.nextInt();
		
		for(int j = start; j <= end; j++) {
			if(j %2 == 0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		
		//example4
		int j = start;
		while(j <= end) {
			if(j % 2 == 0) {
				System.out.print(j+ " ");
			}
			j++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
