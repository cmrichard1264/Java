package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String> ();
	ArrayList<String> list2 = new ArrayList<> ();
	
	
	
	//add
	
	ArrayList <String> name = new ArrayList<>();
	name.add("apple");
	name.add("orange");
	name.add("grape");
	System.out.println(name);
	name.add(1, "strawberry");
	System.out.println(name);
	name.add(4, "milk");
	System.out.println(name);//[apple, strawberry, orange, grape, milk]
	
	
	
	//get
	ArrayList<String> name2 = new ArrayList<>();
	name2.add("Askar");
	name2.add("Bek");
	name2.add("Ayana");
	name2.add(0, "Madina");
	String str = name2.get(2);
	System.out.println(str);
	
	
	//size
	int length = name2.size();
	System.out.println("Size of the ArrayList is: "+length);
	
	for(int i = 0; i< name2.size(); i ++) {
		String each = name2.get(i)+ " ";
		System.out.print(each);
	}
	System.out.println();
	for(String each : name2) {
		System.out.print(each+" ");
	}
	System.out.println();
	
	
	
	//clear
	
	name2.clear();
	System.out.println(name2);
	System.out.println(name2.size());
	
	//set()
	
	ArrayList <String> names = new ArrayList <>();
	names.add("Suna");
	names.add("Aysel");
	names.add("Anna");
	names.add("Enes");
	System.out.println(names);
	
	names.set(1, "Bahadir");
	names.set(2, "Ibrahim");
	System.out.println(names);
	
	
	//contains()
	boolean result = names.contains("Cihan");
	boolean result2 = names.contains("Suna");
	System.out.println(result +" "+ result2);
	
	
	//equals()
	boolean result3 = names.equals(name2);
	System.out.println(result3);
	
	
	//remove(int)
	
	ArrayList <Integer> lists = new ArrayList<>();
	lists.add(1); // 0
	lists.add(2); // 1
	lists.add(3); // 2
	lists.add(4); // 3
	lists.add(5); // 4
	System.out.println(lists.size());
	lists.remove(1);
	System.out.println(lists);
	System.out.println(lists.size());
	
	
	//remove(Integer)
	ArrayList <Integer> lists2 = new ArrayList<>();
	lists2.add(1); // 0
	lists2.add(2); // 1
	lists2.add(3); // 2
	lists2.add(4); // 3
	lists2.add(5); // 4
	//[1, 2, 3, 4, 5]
	System.out.println(lists2);
	Integer a = 8;
	boolean r1 = lists2.remove(a);
	
	System.out.println(list2);
	System.out.println(r1);
	
	
	//remove(String)
	ArrayList<String> city = new ArrayList<>();
	city.add("Miami");
	city.add("Istanbul");
	city.add("Almaty");
	city.add("Tashkent");
	city.add("Baku");
	
	//city.remove("Miami");

	
	if(city.remove("Miami")) {
		city.remove(2);
	}
	city.add(3, "Moscow");
	System.out.println(city);
	
	
	
	//remove(Integer)
	ArrayList <Integer> price = new ArrayList <>();
	price.add(1); //0
	price.add(2); //1
	price.add(3); //2
	price.add(4); //3
	price.add(5); //4
	
	price.remove(Integer.parseInt("2"));
	System.out.println(price);
	
	price.remove(Integer.valueOf("3"));
	boolean r3 = price.remove(Integer.valueOf("3"));
	System.out.println(price);
	System.out.println(r3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
