package day46_SuperKeyword;


class B{
	public B(int a) {
		System.out.println("super");
	}
}


public class DefaultConstructor extends B {

	public DefaultConstructor() {
		super(10);
		System.out.println("Sub");
	}
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
	}
	
}
