package day22_NestedLoop;

public class NestedLoop {
	public static void main(String[] args) {

		for (int z = 0; z < 5; z++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
        
		
		
	//stars 5 times
	   String stars = "*";
	   
	   
	   
	  /* for(int i =0; i<5; i++) {
		   System.out.println("******");
	   }*/
	   
	   
	   int z = 5;
	   while(z>0) {
	   int i = 1;
	   while(i<=5) {
		   System.out.print("!");
		   i++;
	   }
	   System.out.println();
	   z--;
	   }
	   System.out.println("\n");
	   
	   
	   
	   
	   // stars diamond
	   for (int b = 1; b <= 7; b++) {
			for (int i = 1; i<=b; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	   
	   
	   //example2
	   int a =1;
	   while(a<=7) {
		  int b=1;
		  while(b<=a) {
			  System.out.print("$");
			  b++;
		  }
		   
		  System.out.println();
		   
		   
		   a++;
	   }
	   
	   //example3
	   
	   int c =1;
	   while(c<=7) {
		   for (int d = 1; d<=c; d++) {
				System.out.print("#");
			}
			System.out.println("");
	   
	   
	   c++;
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

	}
	       