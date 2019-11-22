package day20_JavaRecap;

public class warmUp1 {

	public static void main(String[] args) {
		
		
		
		// task 1: find the sum of all the numbers between 1 to 1000
		
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++ ) {
		 sum1 += i;}
		System.out.println("sum of all numbers: "+ sum1);
		
		
		
		// task 2: find the sum of all even numbers between 1 to 1000
		// with if statement
		int sum2 = 0;
		for (int i = 1; i <= 1000; i++ ) {
			if(i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("sum af all even numbers: "+sum2);
		
		// with for loop
		int sum3 = 0;
		for(int i = 2; i <=1000; i +=2) {
			sum3+= i;
		}
		System.out.println("sum of all even numbers: "+sum3);
		
		
		
		
		//task 3: find the sum of all odd numbers between 1 to 1000
		//with if statement
		int sum4 = 0;
		for (int i = 1; i <= 1000; i++ ) {
			if(i % 2 == 1) {
				sum4 += i;
			}
		}
		System.out.println("sum af all odd numbers: "+sum4);
		
		
		// with for loop
		int sum5 = 0;
		for(int i = 1; i <=1000; i+=2) {
			sum5 += i;
			}
		System.out.println("sum of all even numbers: "+sum5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
