package day29_ReturnMethods;

public class FrequencyOfCharacters {

	
	
public static void main(String[] args) {
	
	
	// example1
	
	String str = "aabbaaabbbcccccDD";
	
	String duplicate = "";
	
	for(int i = 0; i < str.length(); i ++) {
		if(!duplicate.contains(str.substring(i, i + 1) )  ) {
			duplicate += str.substring(i, i+1);
		}
	}
	System.out.println(duplicate);  // abcD
	
	String result = "";
	
	
	for(int j = 0; j < duplicate.length(); j++) {
		int count = 0;
	for(int i = 0; i < str.length(); i++) {
		if(str.substring(i, i+1).equalsIgnoreCase(duplicate.substring(j, j+1)) ) {
			count++;
		}
		
	}
	result += duplicate.substring(j, j+1) + count+" ";
	}
	
	
	System.out.println(result);
	
	
	
	
	//example2
	
	String str2 = "XXXYYYZZZ";
	String duplicate2 = "";
	for(int i = 0; i < str2.length(); i++) {
		if(! duplicate2.contains(""+ str2.charAt(i) ) ) {
			duplicate2 += ""+ str2.charAt(i);
		}
	}
	
	System.out.println(duplicate2);
	
	
	String result2 ="";
	
	
	for(int j = 0; j < duplicate2.length(); j++) {
	int count2 = 0;
	for(int i = 0; i < str2.length(); i++) {
		if(str2.substring(i, i+1).equals(duplicate2.substring(j, j+1) ) ) {
			count2 ++;
		}
	}
	result2 += duplicate2.substring(j, j+1) + count2 + " " ; 
	}
	
	System.out.println(result2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
