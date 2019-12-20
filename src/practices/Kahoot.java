package practices;

import java.util.*;
public class Kahoot {
	
	
	public static void main(String[] args) {
		Integer[] arr = {100,10,200,20,30,30,30,100};
		LinkedList<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(arr));
		Set<Integer> linked = new LinkedHashSet<>();
		for(int each: list) {
			linked.add(each);
		}System.out.println(list);
		System.out.println(linked);
	}
	
	
}
	
