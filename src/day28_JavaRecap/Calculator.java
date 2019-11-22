package day28_JavaRecap;

public class Calculator {

	public static void main(String[] args) {
		calculate(50, 50, "*");
	}
	
	
	
	
	
	
	public static void calculate(int a, int b, String operator) {
		String result = "";
		if(operator.contentEquals("-")) {
			result += (a-b);
		}else if(operator.equals("+")) {
			result += (a+b);
		}else if(operator.equals("*")) {
			result += (a*b);
		}else if(operator.equals("/")) {
			result += (a/b);
		}else if(operator.equals("%")) {
			result += (a%b);
		}else {
			result = "Invalid";
		}
		
		
		String result2 = "";
		result2 += (operator.equals("-")) ? (a-b)
				:(operator.equals("+")) ? (a+b)
				:(operator.equals("*"))	? (a*b)
				:(operator.equals("/"))	? (a/b)		
		        :(operator.equals("%"))	? (a%b)
		        :("Inavalid");
		
		
		System.out.println(result);
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}


