package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	private String username;
	private String password;
	
	
	
	public credentials() {
		setUsername("Suna");
		setPassword("987654321");
		
	}
	
	//getter
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	//setter
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public void getInfo() {
		System.out.println("username: "+ getUsername());
		System.out.println("password: "+ getPassword());
	}
	
}
public class EncapsulationReview {
public static void main(String[] args) {
	
	credentials obj = new credentials();
	System.out.println(obj.getUsername());
	System.out.println(obj.getPassword());
	
	
	credentials obj2 = new credentials();
	obj2.setUsername("Mira");
	obj2.setPassword("123456789");
	System.out.println(obj2.getUsername());
	System.out.println(obj2.getPassword());
	
	
	credentials obj3 = new credentials();
	obj3.setCredentials("Aysel", "123321");
	System.out.println("username: "+ obj3.getUsername());
	System.out.println("password: "+ obj3.getPassword());
    obj3.getInfo();
    System.out.println("***********************");
    credentials[] users = {obj, obj2, obj3};
    
    
    ArrayList <credentials> credentialList = new ArrayList<>();
    credentialList.addAll(Arrays.asList(users));
    credentialList.get(0).getInfo();
    
    for(credentials each : credentialList){
    	each.getInfo();
    }
    
    
  
}
	
	
}
