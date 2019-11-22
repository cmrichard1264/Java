package day26_ForEach;
import java.util.Arrays;
public class ForEachLoop {

	public static void main(String[] args) {
		
		//example Int
		int[] arr = {1,2,3,4,5};
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("=============");
		
		for(int each : arr) {
			System.out.print(each);
		}
		System.out.println();
		
		
		//example String
		
		String[] str1 = {"A", "B", "C"};
		for(String each: str1) {
			System.out.print(each);
		}
		System.out.println();
		
		
		//example Char
		char[] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
		Arrays.sort(ch);
		for(char charzzz: ch) {
			System.out.print(charzzz);
		}
		System.out.println();
		
		
		
		
		//example int
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int varName: arr1) {
			if(varName % 2 == 0) {
				System.out.print(varName+" ");
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
