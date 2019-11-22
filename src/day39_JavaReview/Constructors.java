package day39_JavaReview;

public class Constructors {
	
	public Constructors() {
		System.out.println("Aysel");
	}

	
	public Constructors(int a) {
		this();
		System.out.println("Mira");
	}
	
	public Constructors(double a) {
		this(100);
		System.out.println("Madina");
	}
	
	public Constructors(boolean a) {
		this(2.5);
		System.out.println("Suna");
	}
	public Constructors(String str) {
		this(100);
		System.out.println("Seyfo");
	}
	
	public Constructors(byte a) {
		this("hello");
		System.out.println("Erhan");
	}
	
	public static void main(String[] args) {
		Constructors obj = new Constructors(2);
	}
	
	
}
