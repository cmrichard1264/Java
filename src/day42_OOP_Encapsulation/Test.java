package day42_OOP_Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		//getter
		TestData obj = new TestData();
		System.out.println(obj.getname());   //private
		String str = obj.getname();
		
		
		System.out.println(obj.getter());
		int num = obj.getter();
		
		//setter
		obj.setName("Madina");
		System.out.println(obj.getname());
		
		obj.setId(1000);
		System.out.println(obj.getter());
	}
}
