package day65_MapInterface;

import java.util.*;
import java.util.function.Predicate;

public class LambdaExpressions {
	public static void main(String[] args) {
		
		Predicate<Integer> remove100 = p-> p == 100;
		List<Integer> list1 = new ArrayList<>(Arrays.asList(100,100,100,100,100,100,100));
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));
		list2.removeIf(R -> R >= 300);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		list3.forEach(p -> { if(p < 5)  {System.out.println(p);}  });
		
		list3.forEach( System.out::println);
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Ibrahim", "Madina", "Suna", "Robert", "Muhtar", "Marufjon" ));
		Predicate<String> removeIM = each -> each.endsWith("im");
		names.removeIf(removeIM);
		System.out.println(names);
		
		List<String> names2 = new ArrayList<>();
		names.forEach( each -> { if(each.startsWith("M")) { names2.add(each); }  } );
		System.out.println(names2);
		names.removeIf(each -> each.startsWith("M"));
		System.out.println(names);
		
		
		
		
		
		
		
	}

}
