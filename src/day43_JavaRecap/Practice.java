package day43_JavaRecap;

import day43_JavaRecap.staticKeyword;

public class Practice {

	public static void main(String[] args) {
		
		staticKeyword.printName();
		
		Practice.printName();
		printName();
		System.out.println(staticKeyword.statName);
		
		staticKeyword obj = new staticKeyword();
	    obj.printName2();
	}

	public static void printName() {
		System.out.println("Semra");
		
	}
}
