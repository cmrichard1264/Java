package day11_IfStatementReview;

public class daysInMonth {
	public static void main(String[] args) {

		/*
		 * 28 days : 2 30 days : 4. 6. 9. 11 31 days : 1. 3. 5. 7. 8. 10. 12
		 * 
		 * 
		 */

		int month = 6;

		if (month > 0 && month < 13) {
			if (month == 4) {
				System.out.println("30 days");
			} else if (month == 6) {
				System.out.println("30 days");
			} else if (month == 9) {
				System.out.println("30 days");
			} else if (month == 11) {
				System.out.println("30 days");
			} else if (month == 2) {
				System.out.println("28 days");
			} else {
				System.out.println("31 days");
			}
		}

		else {
			System.out.println("Invalid Entry");
		}

		System.out.println("\n");
		
		
		
		
		
		
		

		int year = 2015;
		int month2 = 15;
		if (month2 > 0 && month2 < 13) {

			if (month2 == 2) {
				if (year % 4 == 0) {
					System.out.println("29 days");
				} else {
					System.out.println("28 days");
				}
			
				System.out.println("28 days");
			} else if (month2 == 4 || month2 == 6) {
				System.out.println("30 days");
			}

			else if (month2 == 9 || month2 == 11) {
				System.out.println("30 days");
			} else {
				System.out.println("31 days");
			}

		}

		else {
			System.out.println("Invalid");
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
