package day29_ReturnMethods;

public class FrequencyOfCharactersEasyWay {
public static void main(String[] args) {
	
	//incomplete
	
	String str = "AABBCCDD";
	String result = "";
	
	for(int j =0; j < str.length(); j++) {
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		result += ""+str.charAt(j)+count;
		
	}
	
	
	
	
	
	
	
	
	
	
}
	
}
