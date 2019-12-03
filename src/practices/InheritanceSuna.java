package practices;

interface home{
	
	default void methodHome() {
		System.out.println("method Home");
	}
	
	
	
	
}

class Suna implements home{
	  Suna() {
		System.out.println("Suna constructor");
	}
	protected void methodSuna() {
		System.out.println("method Suna");
	}
	
}


 class babyA extends Suna{
	   babyA() {
		   
		    System.out.println("babyA constructor");
	 }
	protected void methodbabyA() {
		System.out.println("method A");
	}
}

 
 class babyB extends babyA{
	   babyB() {
		  System.out.println("babyB constructor");
	}
	protected void methodbabyB() {
		System.out.println("method B");
	}
}

 

public class InheritanceSuna {
public static void main(String[] args) {
	
	
	
	
	
	
	 
	 
	   
	                  
	     
	
	
	
	
	
}
}