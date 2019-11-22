package day42_OOP_Encapsulation;

public class Cybertek {

	public static void main(String[] args) {
		
		EmployeeInfo obj = new EmployeeInfo();
		
		obj.setName("Suna");
		System.out.println(obj.getName());
		
		obj.setSSN(783470559);
		System.out.println(obj.getSSN());
		
		obj.setAge(21);
		System.out.println(obj.getAge());
		
		obj.setSalary(45.50);
		System.out.println(obj.getSalary());
		
		System.out.println("********************");
        EmployeeInfo obj2 = new EmployeeInfo();
		
		obj2.setName("Viktoria");
		System.out.println(obj2.getName());
		
		obj2.setSSN(123456789);
		System.out.println(obj2.getSSN());
		
		obj2.setAge(18);
		System.out.println(obj2.getAge());
		
		obj2.setSalary(75.50);
		System.out.println(obj2.getSalary());
		
		
		System.out.println("*************");
		EmployeeInfo obj3 = new EmployeeInfo();
		obj3.setInfo("Madina", 987654321, 28, 65.5);
		System.out.println(obj3.getName());
		System.out.println(obj3.getSalary());
		System.out.println(obj3.getAge());
		System.out.println(obj3.getSSN());
		
		
	}
}
