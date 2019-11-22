package day20_JavaRecap;

import java.util.Scanner;

public class stringMethods {

	public static void main(String[] args) {
	
		
		//substring
		String str = "Cybertek School";
		str = str.substring(0, str.indexOf(" "));
		System.out.println(str);
		
		String str2 = "Cybertek School";
		//str2 = str2.substring(str2.indexOf("S"));
		str2 = str2.substring(str2.indexOf("S"));
		System.out.println(str2);
		
		
		
		//index of()
		String s1= "Java is a fun language, I love java, good";
		System.out.println(s1.indexOf("a"));//1
		System.out.println(s1.indexOf("ag"));//19
		
		
		
		
		//lastIndexOf()
		System.out.println(s1.lastIndexOf("a"));//34
		System.out.println(s1.lastIndexOf("ava"));//32
		
		
		
		
		//replace()
		
		String name = "Cybertek School Batch 12";
		int lenght = name.length();
		System.out.println(lenght);//24
		name = name.replace(" ", "");
		System.out.println(name.length());
		
		
		//replaceFirst
		
		String a1 = "Java is Fun, Java is object oriented";
		a1 = a1.replaceFirst(" Java", "C++");
		System.out.println(a1);
		
		
		
		// ==, equals(), equalsEgnoreCase()
		
		String name2 = "Cybertek";
	    String name3 = new String ("Cybertek");
	    String name4 = new String ("cybertek");
		System.out.println(name2==name3); // false
		System.out.println(name2.equals(name3)); //true
		System.out.println(name2.equals(name4)); //false
		System.out.println(name2.equalsIgnoreCase(name4)); //true
		
		
		//trim()
		String spaces = "          Ava Richard           ";
		//spaces = spaces.trim();
		System.out.println(spaces.trim());//"Ava Richad"
		
		String spaces1 ="      ";
		spaces1 = spaces1.trim();
		System.out.println(spaces1.isEmpty());//true
		
		
		
		//charAt(index)
		
		String name5 = "Cybertek";
		char ch = name5.charAt(4);
		System.out.println(ch);
		
		
		String name6 = "Please do more and more java ptactices tomorrow";
		char ch2 = name6.charAt(name6.lastIndexOf("o")+1);
		System.out.println(ch2);
		
		
		String sentences = "ABCDE";
		System.out.println(""+sentences.charAt(0)+sentences.charAt(sentences.length()-1));
		//System.out.println(sentences.charAt(sentences.length()-1));
		
		//String result = ""+ sentences.charAt(0)+sentences.charAt(sentences.length()-1);
		//System.out.println(result);

		
		
		
		
		//endsWith
		//@gmail.com
		String gmail = "avarichard@gmail.com";
		boolean result = gmail.endsWith("@gmail.com");
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your email address");
		String gmailaddress = scan.nextLine().toLowerCase();
		if(gmailaddress.endsWith("@gmail.com")) {
			System.out.println("its a valid gmail address");
		}else {
			System.out.println("its NOT a valid gmail address");
		}
		
		
		//startsWith wwww.
		System.out.println("enter a web address");
		String url = scan.nextLine().toLowerCase();
		
		if(url.startsWith("www.")&& url.endsWith(".com")){
        System.out.println("its a valid web address");
		}else {
			System.out.println("its NOT a valid address");
		}
				
		
		
		//contains:
		
		String salary = "1000$";
		boolean result1=salary.contains("$");
		System.out.println(result1);// true
		
		
		
		//concat()
		String school = "Cybertek";
		school = school.concat(" School");
		System.out.println(school);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
