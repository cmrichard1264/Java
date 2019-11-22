package day25_ArraysContinue;

import java.util.Arrays;

public class Practice_2DArray {

	public static void main(String[] args) {
		
		//example 1
		
		int [][] name = { {10,20},  {30,40,50,60,70},   {80,90}   };
		int length = name.length;
		
	
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(Arrays.toString(name[i]));
			
		}
		
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j< name[i].length; j++) {
			System.out.print(name[i][j]+" ");
		}
		}
		System.out.println();
		
		
		//example2
		char[][] name2 = {  {'A', 'B'} ,  {'C','D', 'E', 'F'}  };
		for(int i = 0; i<name2.length; i ++) {
			for(int j = 0; j< name2[i].length; j++) {
				System.out.print(name2[i][j]+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
