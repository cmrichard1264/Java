package day51_Abstraction;

public class quiz {
	public static void main(String[] args) {
		Boolean b1 = new Boolean("tRue");
		Boolean b2 = new Boolean("fAlSe");
		Boolean b3 = new Boolean("abc");
		Boolean b4 = new Boolean(null);
		System.out.println(b1+" "+b2+" "+b3+" "+b4);
		
	
		int[] arr = {3, 2, 1};
		for(int i : arr) {
			System.out.println(arr[i]+" ");
		}
	}

}
