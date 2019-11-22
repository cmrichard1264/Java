package day36_ArrayListMethods;

public class ConstructorsReview {
	
	
	
	public ConstructorsReview () {
		System.out.println("Hello World");
	}
	
	public ConstructorsReview(int a) {
		System.out.println("int a: "+a);
	}
	
	

	public static void main(String[] args) {
		
		
		ConstructorsReview obj = new ConstructorsReview();
		ConstructorsReview obj1 = new ConstructorsReview(10);
	}
}
