package day42_OOP_Encapsulation;

public class EmployeeInfo {

	private String name;
	private long SSN;
	private int age;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
	return name;
	}
	
	public void setSSN(long SSN) {
		this.SSN=SSN;
	}
	
	public long getSSN() {
		return SSN;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	
	public void setInfo(String name, long SSN, int age, double salary) {
		setName(name);
		setSSN(SSN);
		setAge(age);
		setSalary(salary);
	}
	
	
}
