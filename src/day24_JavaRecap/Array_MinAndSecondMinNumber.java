package day24_JavaRecap;

public class Array_MinAndSecondMinNumber {

	
	public static void main(String[] args) {
		
	// write a program that return the minimum value from an int array
			
		int[] array = {10, 20, 30, 40, 50, -5};
		int min = 1200000000;
		for(int i = 0; i <array.length; i++) {
			if(array[i]< min) {
				min = array[i];
			}
		}
		
		System.out.println("Minimum number is: "+min);
		
		

		
		//   write a program that return the second minimum value from an int array 

		int secondMin = 1200000000;
		for (int j = 0; j< array.length; j++) {
			if(array[j] < secondMin && array[j] > min) {   //or!=min 
				secondMin = array[j];
			}
		}
		System.out.println("Second minimum number is: "+secondMin);
		


				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
