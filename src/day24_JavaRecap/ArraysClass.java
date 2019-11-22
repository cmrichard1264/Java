package day24_JavaRecap;

public class ArraysClass {

	public static void main(String[] args) {
		
		// Array declarations:
		//dataType[] name = {1,2,3,4,5};
		
		
		int[] arr = {10, 20, 30};
		
		
		int arr2[] = {1,2,3};
		
		char arr3[]= {'A', 'B', 'C'};
		
	
		String[] MyNumbers = new String[5];
		
		for(int i=0;  i < MyNumbers.length; i++) {
			System.out.println(MyNumbers[i] );
		}
		
		
		int ch[] = new int[3];
		ch[0] = 10;
		ch[1] = 20;
		ch[2] = 30;
		
		System.out.println(""+ch[0]+ch[1]+ch[2]);//102030
		
		
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");//102030
		}
		System.out.println();
		
		ch = new int[4];
		for(int z =0;z<ch.length; z++) {
			System.out.print(ch[z]+" ");//0000
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
