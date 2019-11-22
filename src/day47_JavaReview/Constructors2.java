package day47_JavaReview;


class Abdurazak{
	public Abdurazak(int a) {
		this(5.5);
		System.out.println("int");
	}
	
	public Abdurazak(double b) {
		
		System.out.println("double");
	}
	public Abdurazak(String str) {
		this(5);
		System.out.println("string");
	}
}

public class Constructors2 extends Abdurazak {
	
public Constructors2() {
	super("A");
}
public static void main(String[] args) {
	Constructors2 obj = new Constructors2();
	
}
}
