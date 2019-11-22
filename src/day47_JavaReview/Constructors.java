
package day47_JavaReview;


class Mehmet{
	public Mehmet() {
		System.out.println("Mehmet");
	}
}

class Rasul extends Mehmet{
	public Rasul() {
		System.out.println("Rasul");
	}
}

class Viktoria extends Rasul{
	public Viktoria() {
		System.out.println("Viktoria");
	}
}

public class Constructors {
public static void main(String[] args) {
	Viktoria obj = new Viktoria();
}
	
}
