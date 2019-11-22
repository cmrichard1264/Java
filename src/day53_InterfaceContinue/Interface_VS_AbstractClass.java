package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {

	void method1();
	int method2();
	
	void method3();
	
	void method4();
	
	public default void mm() {
		//predicate
	}
	
	//protected abstract void method5();
	
	int a = 10;	//public final static
	
	public static void main(String[] args) {
		System.out.println(a); //static only accepts static
		System.out.println(Interface_VS_AbstractClass.a); // static can be called by className
		
		
		
	}
}

class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
