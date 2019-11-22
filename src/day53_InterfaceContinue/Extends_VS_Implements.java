package day53_InterfaceContinue;


interface B{
	void method3();
}

public interface Extends_VS_Implements extends B {
	//           subtype                       supertype

	void method1(); //public
	void method2(); //public
	
}

 class A implements Extends_VS_Implements {

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	
}
 
 
 class C extends A implements Extends_VS_Implements{
	 
 }
