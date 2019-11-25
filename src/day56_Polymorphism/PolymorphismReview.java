package day56_Polymorphism;

class A{
	
	public void methodA() {
		
	}
	
}

class B extends A{
	
}

public class PolymorphismReview {
public static void main(String[] args) {
	A obj = new A();
	A obj2 = new B();
	obj2.methodA();
	//obj2.methodB(); only access to the reference type
	//C obj3 = new C(); abstract class is not concrete
	//B obj4 = new A(); child class CANNOT be the reference to parents class
	C obj5 = new D();
	E obj6 = new D();
	//D obj = new E(); no object in Interface
	
	
	
}
}
abstract class C{
	
}
class D extends C implements E{
	
}
interface E{
	
}
abstract class F implements E{
	
}