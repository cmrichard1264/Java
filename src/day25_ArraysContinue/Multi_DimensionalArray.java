package day25_ArraysContinue;

import java.util.Arrays;

public class Multi_DimensionalArray {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3};
		
		int[][] arr2D = {{1,2,3} , {1,2,3} };
		
		              
		String[] str = {"A", "B"};
		
		
		
		
		//example String
		//                    0    1     0    1    2
		String[][] str2D = {{"A", "B"},{"C", "D", "E"} };
		//                      0             1
		
		
		System.out.println(str2D[0][0]);
		System.out.println(str2D[1][1]);
		System.out.println(str2D[1][2]);
		System.out.println(Arrays.toString(str2D[0]));
		
		System.out.println(Arrays.deepToString(str2D));
		
		
		
		
		//Example INT
		//                      0 1    0   1  2     0     1   2    3
		int[][] numbers2D = {  {1,2}, {30,40,50}, {600, 700, 800, 900,}};
		//                       0         1           2
		System.out.println(numbers2D[2][1]);
		System.out.println(Arrays.toString(numbers2D[2]));
		System.out.println(Arrays.deepToString(numbers2D));
		
		//example2
		
		//                         0     1          0       1
		int[][][]  Array3D = {  {{1,2},{3,4}},   {{5,6}, {7,8,9} } };
		//                            0                  1
		
		System.out.println(Arrays.toString(Array3D[1][1]));
		System.out.println(Arrays.deepToString(Array3D[1]));
		System.out.println(Arrays.deepToString(Array3D));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
