package day45_Inheritance;

class Data{
	public String Public;
	private String Private;
	String Default;
	
	public void Hello() {
		System.out.println("Hello");
	}
	
	private void Hola() {
		System.out.println("Hola");
	}
	
	void Aloha() {
		System.out.println("Aloha");
	}
	
	
}

public class MultiClassPractice {
    public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.Public);//visible everywhere
	//	System.out.println(obj.Private); // only visible within its own class
		System.out.println(obj.Default); // visible within its own package
		obj.Aloha();
		obj.Hello();
		//obj.Hola();
		
	}
}
