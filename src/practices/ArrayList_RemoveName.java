package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveName {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Aysel"); //0
		names.add("Robert"); //1
		names.add("Robert");
		names.add("Anna");
		names.add("Aijamal");
		names.add("Suna");
		names.add("Aysel");
		names.add("Robert");
		names.add("Ibrahim");
		
		System.out.println(names);
		
		for(int i = 0; i < names.size(); i ++) {
			names.remove("Aysel");
		}
		
		
		while(names.contains("Robert")) {
			names.remove("Robert");
		}
		
		System.out.println(names);
		
		
	}

}
