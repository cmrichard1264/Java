package day28_JavaRecap;

public class Quiz_04 {
public static void main(String[] args) {
	
	
	int wd = 0;
	String[] days = {"sun", "mon", "wed", "sat"};
	for(int i = 0; i < days.length; i++) {
		switch(days[i]) {
		case "sat":     
		case "sun":   
		   wd -= 1;  
			 break;
		case "mon":    
		    	wd++;     
		case "wed":   
			wd += 2;
		}
	}
	    System.out.println(wd);
	    
	//1 step ==>  ("sun" 0) - 1 = (wd = -1)
	//2 step ==> (wd = -1) +("mon" 1) + ("wed"2) =(wd = 2)
	//3 step ==> (wd = 2) + ("wed" 2) = (wd = 4)
	//4 step ==> (wd = 4) - ("sat" 1) = 3
	
	
	
	
	
}
	
	
}
