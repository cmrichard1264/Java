package day17_StringClass;

public class StringMethods2 {
public static void main(String[] args) {
	
	
	
	//replace (old char, new char):
	
	String name = "Java is Fun Programming Language";
	name = name.replace('a', 'e');
	System.out.println(name);
	
	
	// replace(old str, new str):
	
	String name2 = "Today is gonna be a great day to learn java";
	name2 = name2.replace("Today", "Tomorrow");
	System.out.println(name2);
	name2 = name2.replace("great", "");
	System.out.println(name2);
	
	
	//replaceFirst(old str, new str):
	
	String name3 = "Java is fun, Java is good";
	name3 = name3.replaceFirst("Java", "Python");
	System.out.println(name3);
	
	name3 = name3.replace("is good", "iS Good");
	System.out.println(name3);
	
	String name4 = "Java is programming language, Java is Java";
	name4= name4.replaceFirst("Java is Java", "C# is Java");
	System.out.println(name4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
