package home_work;

public class Task04_HTTPS_StatusCode2 {

	public static void main(String[] args) {
		
		int statusCode = 202;
		String finalResult = "Invalid Status code";
		
		if (statusCode == 200) {
			finalResult = "OK";
		}
	
	    if (statusCode == 201) {
	    	finalResult = "Created";
	    }
	    
	    if (statusCode == 202) {
	    	finalResult = "Accepted";
	    }
	
	System.out.println(statusCode+ ": "+finalResult);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
