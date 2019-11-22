package day11_IfStatementReview;

public class nested_If_drink {
public static void main(String[] args) {
	
	
	/*
	 age >= 18=> tobacco
	 age >= 21=> hookah
	 age >= 25=> tequila
	 age < 18 => milk
	 
	
	 */
	int age = 35;
	boolean goodPerson = false;
	
	if(age>=18) {
		if(goodPerson) {
			System.out.println("Fun is bad for your health");
		}
		else {
			System.out.println("You can buy tobacco");
			if(age>=21) {
				System.out.println("You can buy hookah");
			}
			if (age >= 25) {
				System.out.println("You can buy tequila");
			}
		    }
	        }
	
	
	else {
		System.out.println("Grow up!!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
