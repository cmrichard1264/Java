package day22_NestedLoop;

public class WarmUp {
	public static void main(String[] args) {
       
		
		
		//while Loop
		
		
		String str = "";
		int i = 1;
        while (i <= 30) {
            if (i % 3 == 0 && i % 5 == 0) {str += "FINRA ";}
        	else if (i % 3 == 0) {str += "FIN ";} 
			else if (i % 5 == 0) {str += "RA ";}
            else {str += i + " ";}
			i++;}
		    System.out.print(str);
            System.out.println();
		    
		    
		   
            
            //ternary
            
            
		    String str1 = "";
			int i1 = 1;
			while(i1 <= 30) {
		    str1 += (i1 % 3 == 0 && i1 % 5 == 0)? "FINRA "
		    		:(i1 % 3 == 0)? "FIN "
		    	    :(i1 % 5 == 0)? "RA "
		    	    : i1+" ";
		             i1++;}
		    System.out.print(str1);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}
}
