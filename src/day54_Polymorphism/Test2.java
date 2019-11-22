package day54_Polymorphism;

interface Interface{
	abstract void get();
	static void sum() {
		System.out.println("static");
	}
}

interface Interface2 extends Interface{
	abstract void frame();
}

abstract class AbsClass{
	
}

public class Test2 extends AbsClass implements Interface, Interface2{

	public static void main(String[] args) {
		Interface obj = new Test2();
		obj.get();
		Interface.sum();
		Interface2 obj2 = new Test2();
		obj2.frame();
		
		AbsClass obj3 = new Test2();
		
	}

	@Override
	public void get() {
		System.out.println("Chrome browser");
		
	}

	@Override
	public void frame() {
		System.out.println("Firefox browser");
		
	}
}
