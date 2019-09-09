package day09_Review;

public class If_Statement {

	
	
	public static void main(String[] args) {
		
		
		if (9<10) // must be true 
		{	System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("class starts on Monday");
		}
		
		int a =1000;
		if ( ++a == 1001) {
			a =200;
			System.out.println("a is increased");
			System.out.println(a);
			
			
			System.out.println("\n\n\n");
			
			int x = 55511510;
			if (x%2 == 0) // true
			{
				System.out.println(x);
				System.out.println("its an even number");
			}
			
			
			if (x%2 != 0) // false 
				{
				System.out.println(x);
				System.out.println("its an odd number");
			}
			
			
			
			
			
			
			int y = 25594940;
			if (y %5 == 0) {
				System.out.println(y + " can be devided by 5");
				
			}
			
			
			if (y % 5 != 0) {
				System.out.println(y + " cant be devided by 5");
			}
			
			System.out.println("\n\n");
			
			
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss";
			
			System.out.println(CEO == Kuzzat);
			
			if (Kuzzat == CEO) //true
			{
				System.out.println("Great Person in the world");
								
			}
			
			if (Kuzzat != CEO) // false
			{
				System.out.println("Great Person in the world");
			}
			
			
			System.out.println("\n\n");
			
			int grade = 100;
			boolean Cybertek = true;
			boolean BestSchool= true;
			
			if (Cybertek == BestSchool) {
				grade += 500;
			}
			
			if (Cybertek != BestSchool) {
				grade -= 50;
			}
			
			System.out.println(grade);
			
			
			int age = 50;
			if(age >= 18) {
				System.out.println("You are "+ age + "!"+ " You can vote");
			}
			
			
			
			
			
			
		}
		
	}
}
