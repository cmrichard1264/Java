package home_work;

public class Else_If {
public static void main(String[] args) {
	
	
	    int num1 = 10;
	    int num2 = 5;
	    int num3 = 10;
    if (num1 == num2 && num2 == num3)	{
	System.out.println("all equal");
}
    else if(num1 == num2) {
	System.out.println("num1 and num2 are equal");		
}
    else if(num2 == num3) {
	System.out.println("num2 and num3 are equal");
}
    else if(num1 == num3) {
	System.out.println("num1 and num3 are equal");
}
    else {
	System.out.println("none of them are equal");
}













}
}
