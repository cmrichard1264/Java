package day18_StringClassContinue;

public class StringMethods_Boolean {

	public static void main(String[] args) {
		
		
		//isEmpty():
		
		String str = "Cybertek";
		boolean result = str.isEmpty();
		System.out.println(result);
		
		String str2 = "";
		if(str2.isEmpty()) { System.out.println("it's empty String");}
		else {System.out.println("it's not empty");}
		System.out.println(str2.isEmpty());//true
		
		System.out.println("\n");
		//equals():
		
		String name = "Cybertek";
		String name2 = new String("Cybertek");
		System.out.println(name==name2);//false
		
		System.out.println("java".equals("Java"));//false
		
		
		//equalsIgnoreCase
		
		String s1 = "Java";
		String s2 = new String("jAVA");
		System.out.println(s1==s2);//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		
		//contains():
		
		String name3 = "Muhtar";
		boolean result3 = name3.contains("M");
		System.out.println(result3);//true
		
		String name4  = "Marufjon";
		System.out.println(name4.contains("ABC"));//false
		
		
		//startsWith():
		
		/*String name5 = "Java";
		boolean result5 = name5.startsWith("J");
		System.out.println(result5);//true
		
		String name6 = "Cybertek is a great school";
		System.out.println(name6.startsWith("great school"));//false
		
		
		
		//endWith():
		
		String name7 = "Muhtar";
		System.out.println(name7.endsWith("r"));//true
		System.out.println(name7.endsWith("M"));//false*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
