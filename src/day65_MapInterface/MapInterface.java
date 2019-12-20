package day65_MapInterface;

import java.util.*;

public class MapInterface {

	public static void main(String[] args) {

		Map<String, Double> employees = new HashMap<>();

		// put(): adds keys and value
		employees.put("Nurullah", 200000.99);
		employees.put("Alla", 120000.89);
		employees.put("Erhan", 500000.9876);

		System.out.println(employees);

		double salary1 = employees.get("Nurullah");
		System.out.println(salary1);

		System.out.println(employees.get("Erhan"));
		System.out.println(employees.get("Muhtar"));

		employees.remove("Nurullah");
		System.out.println(employees);

		System.out.println(employees.size());

		boolean a = employees.containsKey("Mahribana");
		System.out.println(a); // the key "Mahribana" is not exist in the map

		boolean b = employees.containsValue(100000.99);
		System.out.println(b);

		Set<String> set = employees.keySet();
		System.out.println(set);

		Map<String, Integer> map1 = new LinkedHashMap<>();
		map1.put("A", 10);
		map1.put(null, null);
		map1.put("B", 10);
		System.out.println(map1);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 20);
		map2.put(null, null);
		map2.put("B", 20);
		System.out.println(map2);

		Map<String, Integer> map3 = new TreeMap<>();
		map3.put("A", 30);
		map3.put("C", 30);
		// map3.put(null, null);
		map3.put("B", 30);
		System.out.println(map3);

		Map<String, Integer> map4 = new Hashtable<>();
		map4.put("A", 40);
		map4.put("C", 40);
		// map4.put(null, null);
		map4.put("B", 40);
		System.out.println(map4);

	}
}