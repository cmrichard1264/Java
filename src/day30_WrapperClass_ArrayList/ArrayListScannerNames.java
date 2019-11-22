package day30_WrapperClass_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListScannerNames {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Madina");
		name.add("Apple");
		System.out.println(name);
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> student = new ArrayList<>();
		
		while(true) {
		System.out.println("Enter a name ");
		String name2 = scan.nextLine();
		student.add(name2);
		
		System.out.println("Do you want to enter another name?");
		String answer = scan.nextLine().toLowerCase();
		
		if( !(answer.equals("yes") || answer.equals("no") ) ){
			System.out.println("Invalid");
			break;
		}
		if(answer.equals("no")) {
		break;
			
		}
		}
		System.out.println(student);
		
		
		
		
		
		
	}
}
