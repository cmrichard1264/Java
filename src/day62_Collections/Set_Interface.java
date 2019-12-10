package day62_Collections;


import java.util.*;

public class Set_Interface {
	
	public static String removeDup(String word) {
		return "";
		
	}

	
	public static void main(String[] args) {
		Set<Integer> st1 = new HashSet<>();
		st1.add(100);
		st1.add(100);
		st1.add(100);
		st1.add(200);
		
		System.out.println(st1.iterator());
		
		Set<Integer> hashset = new HashSet<>();
		hashset.add(100);
		hashset.add(10);
		hashset.add(1);
		hashset.add(1000);
		System.out.println(hashset);
		
		Set<Integer> linkedset = new LinkedHashSet<>();
		linkedset.add(100);
		linkedset.add(10);
		linkedset.add(1000);
		linkedset.add(1);
		System.out.println(linkedset);
		
		Set<String> treeset = new TreeSet<>();
		treeset.add("Z");
		treeset.add("B");
		treeset.add("V");
		treeset.add("K");
		System.out.println(treeset);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(10,9,8,7,6));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		//Remove duplicates   1
		String str = "ZZAZZZAABBCCDD";
		String []arr = str.split("");
		LinkedHashSet<String> restroom = new LinkedHashSet<>(Arrays.asList(arr));
		String result = restroom.toString().replace("[", "").replace("]", "").replace(" ","").replace(",", "");
		System.out.println(result);
		
	
		  // second solution
        String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println(str2);
        
		
		
	}
}
