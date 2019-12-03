package day58_Review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class WarmUp {
	
	public static void main(String[] args) {
		Wait(1);
		System.out.println("Batch 12");
		
		Properties property = new Properties();
		String path = "\\Users\\madin\\Desktop\\properties";
		try {
			FileInputStream file = new FileInputStream(path);
			property.load(file);
		} catch (Exception e) {
			
		}
		String Name =  property.getProperty("Name");
		System.out.println(Name);
		
		System.out.println(getData("Name", "\\Users\\madin\\Desktop\\properties"));
		System.out.println(getData("ID", "/Users/madin/Desktop/properties"));
		System.out.println(getData("DOB", "/Users/madin/Desktop/properties"));
		System.out.println(getData("age", "TestData.properties"));
		System.out.println(getData("url", "files\\TestData2"));
	}
	
	
	
	
	
	
	
	
	
	

	
	public static void Wait(double seconds) {
		try {
			Thread.sleep((long) (seconds * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String getData(String Key, String Path) {
		String data="";
		Properties property = new Properties();
		//String path = "\\Users\\madin\\Desktop\\properties";
		try {
			FileInputStream file = new FileInputStream(Path);
			property.load(file);
		} catch (Exception e) {
			
		}
		data = property.getProperty(Key);
		
		return data;
		
	}
}
