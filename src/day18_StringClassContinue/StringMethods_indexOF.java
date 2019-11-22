package day18_StringClassContinue;

public class StringMethods_indexOF {
public static void main(String[] args) {
	
	//indexOf
	
	String name ="Batch 12 is a great batch";
	int num =name.indexOf("g");
	System.out.println(num);
	int num2 = name.indexOf("eat");
	System.out.println(num2);
	int num3 = name.indexOf("eat")+1;
	System.out.println(num3);
	
	
	String B1 = "today is tuesday, today we have class in the afternoon";
	int num4 = B1.indexOf("ter");
	System.out.println(num4);
	
	String address = " 7925 Jones Branch Dr, Mclean, VA22003";
	int beginIndex = address.indexOf("M");
	int endingIndex = address.indexOf(", VA");
	String cityName = address.substring(beginIndex, endingIndex);
	System.out.println(beginIndex);
	System.out.println(endingIndex);
	System.out.println(cityName);
	
	
	String email = "RandomEmails@gmail.com";
	int begin2 = email.indexOf("gm");
	int end2 = email.indexOf(".com");
	String emailType = email.substring(begin2, end2);
	System.out.println(emailType);
	System.out.println("\n");
	
	
	
	//lastIndexOf
	String str = "ABCDABCD";
	int n2 = str.indexOf("B");
	int n3 = str.lastIndexOf("B");
	System.out.println(n2); // 1
	System.out.println(n3); // 5
	
	
	String myEmail = "ava_richard@gmail.com";
	int begin = myEmail.indexOf("@")+1;
	int end = myEmail.lastIndexOf(".");
	String myEmailType = myEmail.substring(begin, end);
	System.out.println(myEmailType);
	//System.out.println(myEmail.substring(begin, end));
	
	
	
	
	
	
}
}
