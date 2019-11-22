package day31_JavaReview;

import java.util.Arrays;

public class MultiDimensionalArray {
public static void main(String[] args) {
	
	
	
	//2D int Array
                   //    0 1 2       0 1 2	
	int[][] arr2D  = { { 1,2,3 } , { 4,5,6 } };
	                //     0           1               
	
	System.out.println(arr2D[0][2]);
	System.out.println(arr2D[1]);//hashcode
	System.out.println(Arrays.toString(arr2D));//hashcode
	System.out.println(Arrays.deepToString(arr2D));
	
	
	
	//1D char Array
	char[] ch = {'a', 'b', 'c', 'd'};
	for(char each: ch) {
		if(each == 'c') {
			continue;
		}
		System.out.print(each+" ");
	}
	System.out.println();
	
	
	// 2D String Array
	String[][] names = {   {"Cersei", "Jaime"}, {"Sansa", "Ariya", "Bran"}, {"Olenna", "Margery", "Loras" }   } ;
	for(String[]each1D : names) {
		//System.out.println(Arrays.toString(each1D));
		for(String eachValue : each1D) {
			if(eachValue.equals("Olenna") || eachValue.equals("Loras")) {
				continue;
			}
			System.out.print(eachValue+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
}
