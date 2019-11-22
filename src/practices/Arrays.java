package practices;

public class Arrays {
	public static void main(String[] args) {
		
	
	String [] name = {"Madina", "Mira", "Lucia"	};
	for(int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	}
	
	for(String each: name) {
		System.out.println(each);
	}
	System.out.println("*************");
	
	
	String name2 = "Mira";
	for(int i = name2.length()-1; i >= 0; i--) {
		System.out.print(name2.substring(i, i+1));
	}
	

}

	
}