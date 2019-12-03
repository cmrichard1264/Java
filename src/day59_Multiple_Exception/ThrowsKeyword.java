package day59_Multiple_Exception;

import java.io.FileInputStream;

public class ThrowsKeyword {
	
	public static void main(String[] args)  {
	//	sleep(3000);   contains throws keyword
		sleep2(3000);
		//test();
		method3();
	}
	
	
	
	
	public static void sleep(long milliSec) throws InterruptedException {
		Thread.sleep(milliSec);
	}
	
	public static void sleep2(long milliSec) {
		try {
			Thread.sleep(milliSec);
		}catch(Exception e) {
			
		}
	}
	
	public static void method1() {
		try {
			sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		Thread.sleep(3000);
		System.out.println("Hello");
		System.out.println("World");
		System.out.println(10/0);
		Thread.sleep(5000);
	}

    public static void method2() throws Exception {
    	Thread.sleep(3000);
    	FileInputStream fil = new FileInputStream("");
    }
 
    public static void method3() throws RuntimeException{
    	System.out.println(9/0);
    }





}
