package practices;

import home_work.Encapsulation;

public class Getter_Setter {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		//System.out.println(obj.getName());
		obj.setName("Suna");
		System.out.println(obj.getName());
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getName());
		
	}
}
