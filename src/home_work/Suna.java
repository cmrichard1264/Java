package home_work;

import java.util.ArrayList;
import java.util.Arrays;

public class Suna {

	int a = 5;//instance;   belongs to the object;   each object has its own copy 
	//outside the method, within the class
	static int b = 10;//static;   belongs to the class;   only one copy;   no object needed
	//methods body:
	
	//public      private      protected      default     final
	// static     instance
	//void(no return)         primitive(return)       nonPrimitive(return)      String(return)  
	//methodName
	// (arguments)  (parameters)
	
	
	
	
	//   (    [5,10,15,5,3,5], 5   )
	public static ArrayList<Integer> removeInst(ArrayList<Integer> numbers, Integer number) {
		numbers.removeAll(Arrays.asList(number));
		return numbers;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		    ArrayList<Integer>  arr = new ArrayList<>();
		    Integer[] nums = new Integer[]{10, 5, 15, 20, 5, 15, 5 , 5 , 5};
		    arr.addAll(Arrays.asList(nums));
		    
		    System.out.print(removeInst(arr,5)); // 10 15 20 5 15
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int a = 5;//local
		a = 50;
		Suna obj = new Suna();
		obj.a = 100;
		obj.b = 500;
		Suna obj2 = new Suna();
		obj2.a = 200;
		b = 1000;
		b = 5000;
		
		System.out.println(obj.a+" "+obj.b);//  100 5000
		System.out.println(obj2.a+" "+ b);//    200 5000
		
		
		a obj5 = new b();
		//obj5.method();
		a object;
		object = new b();
		object.method();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}



abstract class a{
	
	
	
	int classA;
	
	void method() {
		System.out.println("method from class a");
	}
	
	
}

class b extends a{
	
	int classB;
	
	
	void method() {
		//super.method();
		System.out.println("method from class b");
	}
	void methodA() {
		System.out.println("method A from class b");
	}
	
	

}


