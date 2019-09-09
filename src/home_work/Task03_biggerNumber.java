package home_work;

public class Task03_biggerNumber {

	public static void main(String[] args) {
		
		// solution 1:
		
		int n1 = 10000;
		int n2 = 5000;
		int n3 = 300;
	    int max = 0;
		
		if (n1>n2 && n1>n3) {
			max = n1;
		}
		
		
		if (n2>n1 && n2>n3) {
			max = n2;
		}
		
		
		if ( n3>n1 && n3>n2) {
			max = n3;
		}
		
		System.out.println("Maximum number between "+n1+", "+n2+" and "+n3+" is "+ max);
		
		System.out.println("\n");
		
		
		
		//solution 2:
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maximum number is "+ n1);
		}
		
		if(n2 > n1 && n2 > n3) {
			System.out.println("Maximum number is "+ n2);
		}
		
		
		if(n3 > n1 && n3>n2) {
			System.out.println("Maximum number is "+ n3);
		}
		System.out.println("\n");
		
		//solution 3
		
		//String result = "Maximum number between 10, 20 and 30 is 30";
		//System.out.println(result);
				
		
		//solution 4
		
		int num1=100, num2=100, num3=100;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" is the bigger number");
		}
	else if (num2 > num1 && num2 > num3) {
		System.out.println(num2+" is the bigger number");
	}
	else if (num3 > num1 && num3 > num2) {
		System.out.println(num3+" is the bigger number");
	}
	else if (num3 == num2 && num3 > num1) {
		System.out.println(num3+" and "+num2+" are the bigger number");
	}
		
	else if(num3 == num1 && num3 > num2){
		System.out.println(num3+" and "+num1+" are the bigger");
	}
	else if(num2 == num1 && num2 > num3) {
		System.out.println(num2+" and "+num1+" are the bigger number");
	}
	else {
		System.out.println("all of them are equal");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}