package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveAhmed {

	public static void main(String[] args) {
	
	
     String[] names = { "Bahadir", "Ibrahim", "Aysel", "Bahadir", "Yuriy", "Aijamal", "Bahadir"};
     
     ArrayList<String> students = new ArrayList<>(Arrays.asList(names));
     
     System.out.println(students);
     
     students.remove(0);
     students.remove("Aijamal");
     System.out.println(students);
     
     students.removeAll(Arrays.asList("Bahadir"));
     System.out.println(students);
     
     
    
     
	}
}
