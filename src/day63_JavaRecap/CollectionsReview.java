package day63_JavaRecap;

import java.util.*;

public class CollectionsReview {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(1,2,3));
		
		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(100);
		stack.add(200);
		stack.add(300);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}
