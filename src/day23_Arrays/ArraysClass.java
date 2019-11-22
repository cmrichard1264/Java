package day23_Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		
		
		//example String
		String[] name = {"Nigar","Sumeya", "Madina","Juline"};
		                // 0		1         2         3
		
		System.out.println(name[2]);
		
		String str1 = name[1];
		String str2 = name[3];
		
		System.out.println(str1+" "+str2);
		
		
		//example double
		double[] myArrays = { 1,2,3,4,5,8,0,2};
		                   // 0 1 2 3 4 5 6 7
		
		for(int i = 0; i < 8; i++) {
			System.out.print(myArrays[i]+ " ");
		}
		
		System.out.println();
		
		//example int
		int[] numbers = {12, 24, 36, 48, 60, 72, 84, 96, 108};
		int b = numbers.length;
		System.out.println(b);
		int highestIndexNum = numbers.length - 1;
		System.out.println(highestIndexNum);
		
		
		for(int i = 0; i < numbers.length; i++) {
		//	System.out.print(numbers[i]+" ");
		int s1 = numbers[i];
		System.out.print(s1+" ");
		}
		
		System.out.println();
		
		
		//example char
		
		char[] myChars = {'A', 'B', 'C', 'D'};
		int highestIndexNum2 = myChars.length -1;
		System.out.println(highestIndexNum2);
		
		
		
		
		
		
		
		
	}
}
