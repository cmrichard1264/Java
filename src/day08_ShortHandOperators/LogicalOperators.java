package day08_ShortHandOperators;

public class LogicalOperators {

	

	
	
	public static void main(String[] args) {
		
		//   ||: or logic
		
		boolean A = "Monday" == "Fun-day" || 6 == 6;
		System.out.println(A);
		
		boolean B = true || false;
		System.out.println(B);
		
		boolean C = !(8>5) || !("Today" != "friday");
		System.out.println(C);
		
		boolean D = true && true || false;
		System.out.println(D);
		
		
		//   &&: and logic
		
		boolean E = !(7 > 5 && 6 !=5) && (9 > 5 || 10 > 4);
		//          !(true   && true) && (true  || true  )
		//                 !true      &&      true
		//                  false     &&      true
		//                          false
				
		System.out.println(E); //false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
