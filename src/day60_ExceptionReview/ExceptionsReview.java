package day60_ExceptionReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsReview {
	
	public static void main(String[] args) {
		
	
	
	try {
	FileInputStream file = new FileInputStream("path");
	System.out.println("try block");
	}catch(FileNotFoundException e){
		System.out.println("catch block");
	}
	
	try {
	System.out.println(9/0);
	System.out.println("try block");
	}catch(ArithmeticException e) {
		System.out.println("catch block");
	}finally {
		System.out.println("finally block");
	}
	}
	
	
	
	
	
	
	
	
	}	


