package day17_StringClass;

public class StringMethods {

	public static void main(String[] args) {
		
		//concat
		String name = "Cybertek";
		name = name.concat(" School");
		System.out.println(name);
		
	    //length():
		String longName = "Madina";
		int num = longName.length();
		System.out.println(num);
		
		//charAt():
		String name1 = "Madina";
		char ch = name1.charAt(0);
		System.out.println(ch);		
		
		//toUpperCase():
		String name2 = "cybertek";
		name2 = name2.toUpperCase();
		System.out.println(name2);
		
		//toLowerCase():
		String name3 = "KINGSLEY";
		name3 = name3.toLowerCase();
		System.out.println(name3);		
		
		
		//trim():
		
		String s1 = "     Hello Cybertek";
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		
		
		//substring():
		String str = "Cybertek School";
		//            0123456789
		str = str.substring(9);
		System.out.println(str);
		
		String address = "Mclean VA 22000";
		//                012345678910
		String zipcode = address.substring(10);
		System.out.println(zipcode);
		
		
		// substring(beginning/ending):
		String NAME = "Hello Cybertek School";
		            // 0123456789...........
		NAME=NAME.substring(6, 14);
		System.out.println(NAME);
		
		
		String fullName = "Cybertek School Batch12";
		//                 0123456789.............
		String middleName = fullName.substring(9, 15);
		System.out.println(middleName);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
