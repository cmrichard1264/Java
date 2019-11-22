package day20_JavaRecap;

import java.util.Scanner;

public class warmUp4 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int max = 0;
	
	for(int i = 1; i <=5; i++ ) {
	System.out.println("Enter a number");
	int num = scan.nextInt();
	if( num > max) {
		max = num;
	}
	}
	System.out.println("max value is: "+max);
	
	
	
	
	
	
	
	
}
}
