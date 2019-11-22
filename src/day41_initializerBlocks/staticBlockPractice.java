package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {

	public static String name;
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList <>();
	public static ArrayList<String> students = new ArrayList<>();
	public static String[] online = {"Madina", "Suna", "Mira", "Aysel"};
	public static String [] inClass = {"Sherinay", "Alexis", "Oxana", "Seyfo"};
	int a;
	
	
	static {
		name = "Madina";
		arr1 = new int[5];
		arr1[0] = 1;
		arr1[2] = 3;
		
		list.add("coffee");
		students.addAll(Arrays.asList(online));
        
		
	}
	
	public staticBlockPractice() {
		name = "Mira";
	}
	
	
	static {
		name = "Suna";
		arr1 = new int[3];
		arr1[1] = 2;
		list.add("tea");;
		students.addAll(Arrays.asList(inClass));
		students.add("Sasha");
	}
	
	
	public static void main(String[] args) {
		staticBlockPractice obj1 = new staticBlockPractice();
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(list);
		System.out.println(students);
		
	}
	
}
