package day23_Arrays;

import java.util.Scanner;

public class FindUniqueCharcacterFromString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write something");
		String str = scan.nextLine();
		String unique = "";
		
		for(int j = 0; j < str.length(); j++) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals(""+str.charAt(j) )) {
				count++;
			}
		}
		
		
		
		if(count == 1) {
			unique += ""+str.charAt(j);
		}
		
		
		}
		
		System.out.println("These are the unique characters from scanner: "+unique);
		
		
		//example2
		String str2 = "all the letters";
		String unique2 ="";
		
		for(int j = 0; j < str2.length(); j++) {
		int count = 0;
		for(int i = 0; i < str2.length(); i++) {
			if(str2.substring(i, i+1).equals(str2.substring(j, j+1) ) ) {
				count++;
			}
		}
		if(count == 1) {
			unique2 += str2.charAt(j);
		}
		}
		System.out.println("These are the unique characters from example 2: "+unique2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
