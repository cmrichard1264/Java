package day27_CustomMethods;
import java.util.Arrays;
public class WarmUp {

	public static void main(String[] args) {
		
		int[] numbers;
		numbers = new int[100];
		
		for(int i = 0; i < 100; i++) {
			numbers[i] = i+1;
			
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int each: numbers) {
		     if(each % 2 != 0) {
		    	 continue;
		     }
		     System.out.print(each+ " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
