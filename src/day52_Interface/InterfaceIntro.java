package day52_Interface;

public interface InterfaceIntro {
	
	   //{}    no Instance block
	   //static {}   no Static block
	   //public InterfaceIntero() {}   no Constructor
       // public void methodD() {}    no instance method
	

    void methodA();    //abstract  ==> public
	static void methodB() {} //static==> public
	default void methodC() {}//default ==> public
	
	int a = 100;   // public static final by default
	
	
	public static void main(String[] args) {
		InterfaceIntro.methodB();
		
		System.out.println(a);
		//a = 200;
	}
     
}

     

class D implements InterfaceIntro {
	static int a = 200;
	static {
		
	}
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}
}


class Test implements InterfaceIntro{
	@Override
	public void methodA() {
		System.out.println("Method A");
	}
}
