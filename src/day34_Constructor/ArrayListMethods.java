package day34_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
public static void main(String[] args) {
	
	//indexOf
	ArrayList<Integer> list = new ArrayList<> ();
	list.add(1);
	list.add(Integer.valueOf("33"));//none
	list.add(Integer.parseInt("100"));//auto boxing
    list.add(200);
	list.add(33);
	
	
	System.out.println(list);
	int a = list.indexOf(11);
	System.out.println(a);
	int a2 = list.indexOf(33);
	System.out.println(a2);
	
	
	//lastIndexOf
	int a3 = list.lastIndexOf(33);
	System.out.println(a3);
	
	
	//Arrays.asList()
	Integer[] arr = {10,20,30};
	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); 
	list2.add(40);
	System.out.println(list2);
	
	
	//isEmpty()
	 String[] arr2 = { "Java", "Python", "C#", "C++"};
     
     
     ArrayList<String> list3 = new ArrayList<>( Arrays.asList(arr2) );
     
     // isEmpty(): checks if the arraylist is empty and returns boolean expression   
         System.out.println( list3.isEmpty() );
         list3.add("F");
         
         System.out.println(list3);  
         
     
         
         
         //addAll()
     	String[] name1 = { "Hakan", "Alexis", "Rahwa", "Erhan", "Holy"};
         
         ArrayList<String> names = new ArrayList<>();
             names.addAll(  Arrays.asList( "Almaz" , "Ibrohim" , "Tabi" )  );
             
             names.addAll(Arrays.asList(name1) );
             System.out.println(names);
         
         
         
         
         
         
         //removeAll()
         ArrayList<Integer> list4 = new ArrayList<>();
         list4.addAll(Arrays.asList(1,2,3,1,2,3));
         list4.removeAll(Arrays.asList(1, 3));
         System.out.println(list4);
	
	
	
	     //sort()
         Integer[] array = {1000, 900, 80, 765, 123, 542};
         ArrayList<Integer> price = new ArrayList<>(Arrays.asList(array));
	     System.out.println(price);
	     Collections.sort(price);
	     System.out.println(price);
	
	
	
	
	
	
	
	
	
	
	
	
}

}
