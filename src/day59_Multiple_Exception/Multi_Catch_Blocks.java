package day59_Multiple_Exception;

import java.util.NoSuchElementException;

public class Multi_Catch_Blocks {
	
	public static void main(String[] args) {
		
	


	
	
	int[] arr = {1,2,3};
	try {
		System.out.println(arr[100]);
	}catch(NullPointerException e) {
		System.out.println("Null pointer exception");
	} catch(ClassCastException e) {
		System.out.println("Class cast exception");
	}catch(NoSuchElementException e) {
		System.out.println("No such element exception");
	} catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array out of bounds exception");
	}catch(IndexOutOfBoundsException e) {
		System.out.println("Index out of bound exception");
	}
	
	System.out.println("=============================");
	
	try {
		System.out.println(11/0);
	}catch(ClassCastException e) {
		System.out.println("Class cast");
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic");
	}catch(RuntimeException e) {
		System.out.println("Runtime");
	}catch(Exception e) {
		System.out.println("Exeption");
	}

}
	
	
}
