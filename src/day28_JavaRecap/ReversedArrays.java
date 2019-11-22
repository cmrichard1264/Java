package day28_JavaRecap;

import java.util.Arrays;

public class ReversedArrays {

	public static void main(String[] args) {
		int[] arr = {0, -1, 1000, 2000, 5000};
        
        sortDes(arr);
	}
	

    

	public static void sortDes(int [] arr) {
    	  Arrays.sort(arr);
    	  for(int i = arr.length-1; i >= 0; i--) {
    		  System.out.print(arr[i]+" ");
    	  }
    	  
      }
      
      
      
      
}