package day15_Scanner_StringClass;

public class StringClass {
	public static void main(String[] args) {

		String str = "Cybertek";

		String A = "Cybertek";
		String B = "Cybertek";
		System.out.println(A == str && A == B);// stored in String pool

		String str2 = new String("Cybertek");
		System.out.println(str2 == "Cybertek");// different memory locations

		String str3 = new String("Cybertek");
		System.out.println(str2 == str3);

	}
}
