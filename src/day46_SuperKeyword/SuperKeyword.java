package day46_SuperKeyword;

class A{
	String name = "Madina";
	public void methodA() {
		
	}
	
	
	public A(int a) {
		
	}
}






public class SuperKeyword extends A{
	public SuperKeyword(int a) {
		super(10);
	}

//	String name = "Madina";
	
	public void method() {
		super.name = "Suna";
		this.name = "Mira";
		super.methodA();
		this.methodA();
	}
	
}
