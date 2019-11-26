package practices;

interface home{
	default void methodHome() {
		System.out.println("method Home");
	}
}

class Suna implements home{
	protected void methodSuna() {
		System.out.println("method Suna");
	}
}

class babyA extends Suna{
	protected void methodbabyA() {
		System.out.println("method A");
	}
}

class babyB extends babyA{
	protected void methodbabyB() {
		System.out.println("method B");
	}
}


public class InheritanceSuna {
public static void main(String[] args) {
	
	
	
	
	
	
}
}