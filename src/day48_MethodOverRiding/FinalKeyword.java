package day48_MethodOverRiding;

class Credentials{
	private final String userName = "Cybertek";
	final private String password = "012345";
	
	public void setUserName(String userName) {
		//this.userName = userName;   //final variables cannot be re-assigned
	}
	public String getUserName() {
		return userName;
	}
}

class Holly{
	final public void printName() {
		System.out.println("Erhan");
	}
}

public class FinalKeyword extends Holly  {
	/*@Override
	public void printName() {
		System.out.println("Madina");     //final methods cannot be override
	}*/
	
	
	
    final int Age = 100;

	public static void main(String[] args) {
		
		final String SSN = "123456";
		//SSN = 654321; final variables are constant and cannot be reassigned
		
		final String dob;
		
		//System.out.println(dob);//must be initialized before using it
		FinalKeyword obj = new FinalKeyword();
		//obj.Age = 5; //cannot be changed
		System.out.println(obj.Age);
	}
	final public static void add(int a, int b) {
		System.out.println(a+b);
	}
	 final public static double add(double a, double b) {
		return a+b;
	}
	
}
