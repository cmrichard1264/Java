package day43_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

	static String[] arr = new String[3];
	static ArrayList<String> list = new ArrayList<>();
	double salary;
	
	
	
	
	static {
		System.out.println("static");
		arr[2] = "Alla";
		arr[0] = "Kateryna";
		arr[1] = "Ruslan";
		list.addAll(Arrays.asList(arr));
		StaticBlock obj = new StaticBlock();
		obj.salary = 4000;
		System.out.println(obj.salary);
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("main");
		arr[0] = arr[2];
		System.out.println(list);
		StaticBlock obj = new StaticBlock();
		obj.salary = 5000;
		System.out.println(obj.salary);
	}
}
