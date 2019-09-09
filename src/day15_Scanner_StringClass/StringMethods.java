package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// charAt(index):

		String str = "Cybertek";
		// 01234567
		System.out.println(str.charAt(0)+" "+ str.charAt(1)+" "+str.charAt(2));// C
		char letter = str.charAt(0); // C
		
		System.out.println(letter);
		

		String str2 = "Mu htar";
		// 0123456
		System.out.println(str2.charAt(0)); // M
		
		
		String a = "Batch 12 Javengers";
		System.out.println(a.charAt(9));// J

		
		
		
		

		// length():

		String name = "Donald J Trump";
		System.out.println(name.length()); // 14
		
		
		
		int Length = a.length();
		System.out.println(Length);//18
		int HighestNum = a.length()-5;
		System.out.println(HighestNum); //13
		
			
		

		// concat():

		String s1 = "Cybertek";
		s1.concat(" School");
		System.out.println(s1);
		s1 = s1.concat(" School");
		System.out.println(s1);
		
		String b = "Batch 12";
		System.out.println(b); // Batch 12
		String c = b.concat(" Javengers");
		System.out.println(c); // Batch 12 Javengers
		
		
		
		
		
		

		// toUpperCase 1

		String N = "madina";
		N.toUpperCase();
		System.out.println(N);//madina
		N = N.toUpperCase();
		System.out.println(N); //MADINA
		
			
		
		//toUpperCase2
		System.out.println(" Enter your first and last name:");		
		String firstname = scan.nextLine().toUpperCase(),
			   lastname = scan.nextLine().toUpperCase();		
		String fullname = firstname +" "+lastname;		
		System.out.println(fullname);
		
		
		
		
		
		
		
	    //toLowerCase():
		
		String name1 = "JAVA IS FUN";
		name1.toLowerCase();
		System.out.println(name1);//JAVA IS FUN
		name1 = name1.toLowerCase();
		System.out.println(name1); //java is fun
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
