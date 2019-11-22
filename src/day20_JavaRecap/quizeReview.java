package day20_JavaRecap;

public class quizeReview {
public static void main(String[] args) {
	
	//
     String str = "Hello World";
     
	  System.out.println(str.substring(10/5-2, 20/4));
	
	//
	int z = 5;
	for(int i =5; i>0; i--) { //5, 4, 3, 2, 1
		z+= i;                //10 14 17 19 20
	}
	
	
	System.out.println(z); //20
	
	
	//
	int i = 0;
	for(i=5; i<10;) {  // 5, 7, 9
		i+=2; 
	}
	
	System.out.println(i);  //1
	
	//
	for (int j =1; j<5; ) {
		++j;
		System.out.print(j+" ");
	}
	
	System.out.println();
	
	
	
	//
	for (int j =1; j<5; ) {
		System.out.print(j+" ");
		j++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
