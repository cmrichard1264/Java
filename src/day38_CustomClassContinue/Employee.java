package day38_CustomClassContinue;

public class Employee {

	String name;
	String id;
	int age;
	int SSN;
	String title;
	double salary;
	
	public Employee(String name, String id, int age, int SSN, String title, double salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.SSN = SSN;
		this.title = title;
		this.salary = salary;
	}
	
	public void getInfo() {
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Social security number: "+ SSN);
		System.out.println("Age: "+age);
		System.out.println("Job title: "+title);
		System.out.println("Hourly rate: $"+salary);
		System.out.println("--------------------");
	}
	
	
}
