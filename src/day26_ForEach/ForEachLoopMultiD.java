package day26_ForEach;
import java.util.Arrays;
public class ForEachLoopMultiD {

	public static void main(String[] args) {
		
		
		//example int
		int[] arr1d = {1,2,3,4};
		int[][] arr2d = { {1,2,3,4}  ,  {5,6,7,8,9}   };
		//                   0               1
	         
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[i].length; j++) {
				System.out.print(arr2d[i][j]+" ");
			}
		}
		System.out.println();
		
		for(int[] each: arr2d) {
			for(int each2 : each) {
				System.out.print(each2+" ");
			}
		}
		System.out.println();
		
		//example2
		String[][] str2d = {  {"Bibish","Syfo"}, {"Safooo", "Julia"}  };
		
		for(String[] each1DArrays : str2d) {
			//System.out.println(Arrays.toString(each1dArrays));
		
		
		for(String EachValues : each1DArrays) {
			System.out.print(EachValues+" ");
		}
	    System.out.println();
		}
		
		
		
		//example3
	    
	    int[][] num2D = { {1,2}, {3,4} };
	    int [][][] num3D = {   {  {1,2}, {3,4} } ,  {  {5,6}, {7,8,9}  }  };
	    for(int[][] each2DArray: num3D) {
	    	for(int[] each1DArray: each2DArray) {
	    		for(int eachValues: each1DArray) {
	    			System.out.println(eachValues + " ");
	    		}
	    	}
	    }
	    
		
		
		
		
		
		
	}
}
