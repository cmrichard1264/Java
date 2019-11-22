package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		//split(str):
		
		String sentence = "Today is a great day, good day to learn Java";
		String[] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		
		String email = "FirstName_LastName";
		String[] arr2= email.split("_");
		System.out.println(Arrays.toString(arr2));
		
		
		
		String fullname = "Cybertek School Batch12";
		String[] array1 = fullname.split(" ");
		System.out.println(Arrays.toString(array1));
		
		
		//how many times Java is occurred
		//ex1
		String java = "I love Java and Java is fun, Java is Life Java ";
		String[] array2 = java.split("Java");
		System.out.println(Arrays.toString(array2));
		System.out.println(array2.length-1);//4 times
		
		//ex2
		String python = " Python is good, i love Python, Python is love";
		String[] array3 = python.split("Python");
		System.out.println(array3.length-1);//3 times
		System.out.println(Arrays.toString(array3));
		
		
		//split the email into first/middle/last names
		String emailAddress = "ava.lua.richard@gmail.com";
		emailAddress = emailAddress.substring(0, emailAddress.indexOf("@"));
		
		String[] array4 = emailAddress.split("\\.");
		System.out.println(Arrays.toString(array4));
		System.out.println("First name is: "+array4[0]);
		System.out.println("Middle name is: "+array4[1]);
		System.out.println("Last name is: "+array4[2]);
		
		
		//toCharArray():
		String Str = "Java";
		char[] ch = Str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		
		
		
		
		
		
	}
}
