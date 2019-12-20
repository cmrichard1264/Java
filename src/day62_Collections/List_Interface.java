package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;



public class List_Interface {
public static void main(String[] args) {
	
	
	//List<Integer> list1 = new List<>();
	
	List<Integer> list2 = new ArrayList<>();
	List<String> list3 = new LinkedList<>();
	List<Double> list4 = new Vector<>();
	
	 ArrayList<Integer> arraylist = new ArrayList<>();
     arraylist.add(10);
     arraylist.add(20);
     arraylist.add(30);
     arraylist.remove(1);
     
     System.out.println(arraylist);
	
	LinkedList<Integer> linkedlist = new LinkedList<>();
	linkedlist.add(10);
	linkedlist.add(20);
	linkedlist.add(30);
	linkedlist.remove(1);
	
	System.out.println(linkedlist);
	
	String[] arr = {"A", "B", "B"};
	
	List<String> notlinked = new ArrayList<>(Arrays.asList(arr));
	System.out.println("ArrayList: "+ notlinked);
	
	List<String> linked = new LinkedList<>(Arrays.asList(arr));
	System.out.println("LinkedList: "+ linked);
	
	Vector<Integer> vt = new Vector<>();
	vt.add(1);
	
	Stack<Integer> st = new Stack<>();
	for(int i = 10; i<=80; i+=10) {
		st.add(i);
	}
	/*st.add(1);
	st.add(2);
	st.add(3);
	st.add(4);*/
	
int num =	st.pop();
	
	//System.out.println(st.pop());
	System.out.println(num);
	
	
	
	
	
}
}
