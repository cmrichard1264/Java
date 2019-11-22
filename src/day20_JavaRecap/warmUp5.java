package day20_JavaRecap;

import java.util.Scanner;

public class warmUp5 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
	
	for(int i = 1; i <=5; i++ ) {
	System.out.println("Enter a number");
	int num = scan.nextInt();
	if( num < min) {
		min = num;
	}
	}
	System.out.println("min value is: "+min);
	
}
}
 
  