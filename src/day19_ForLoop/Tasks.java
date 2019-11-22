package day19_ForLoop;

public class Tasks {
	public static void main(String[] args) {

		// task01

		for (int i = 1; i <= 3; i++) {
			System.out.print("Value of i " + i + " is: " + (i * i)+"   ");
		}
		System.out.println();

		// task02
		for (int a = 1; a <= 32; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

		// task03
		for (int i = 1; i <= 32; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				
			}
		}
		System.out.println();
		
		
		
		//task04
		String str = "Madina and Adrien";
        //String rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--) {
        	reversed += str.charAt(i);
        }
        
        System.out.println(reversed);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
