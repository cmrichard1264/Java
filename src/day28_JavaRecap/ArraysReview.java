package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview {
public static void main(String[] args) {
	
	
	int[] arr1D = {10, 20, 30, 40};
	//             0   1   2   3
	
	
	for(int each : arr1D) {
		if(each == 20) {
			continue;
		}
		System.out.print(each+" ");
		break;
	}System.out.println();
	
	
	
	long[] array = {20, 400, 500, 0, 10, 20};
	System.out.println(Arrays.toString(array));
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	
	
	
	int[] [] arr2 = {   {10, 20},  { 30, 40}  };
	System.out.println(Arrays.deepToString(arr2))	;
	System.out.println( Arrays.toString(arr2[1]) )  ;
	System.out.println(arr2[1][1]);
	
	
	
	for(int[] each2 : arr2) {{
		for(int each3 : each2)
		System.out.print(each3+" ");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
