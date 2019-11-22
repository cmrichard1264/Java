package day47_JavaReview;


class A{
	public String name1 = "Ayaz";
}

class B extends A{
	public String name2 = "Sucran";
	public String name3 = "Erhan";
	
	
	public void method() {
		super.name1 = "Madina";
	}
}

public class Inheritance extends B {
    public String name4 = "Mehmet";
    public String name5 = "Mahriban";
    
    
    
    public static void main(String[] args) {
		
    	Inheritance obj = new Inheritance();
    	System.out.println(obj.name1);  //Inheritance class has all 5 names
    	System.out.println(obj.name2);
    	System.out.println(obj.name3);
    	System.out.println(obj.name4);
    	System.out.println(obj.name5);
    	System.out.println("*****************");
    	
    	A obj2 = new A();
    	System.out.println(obj2.name1);
    	//System.out.println(obj2.name3); class A only has name1
    	System.out.println("********************");
    	
    	B obj3 = new B();
    	System.out.println(obj3.name1);
    	System.out.println(obj3.name2);
    	System.out.println(obj3.name3);
    //	System.out.println(obj3.name4); class B only has name 1; 2; 3;
    	System.out.println("*******************");
    	
	}
}
