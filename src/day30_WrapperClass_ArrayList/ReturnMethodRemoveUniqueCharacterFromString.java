package day30_WrapperClass_ArrayList;

public class ReturnMethodRemoveUniqueCharacterFromString {

	public static void main(String[] args) {
		String str = uniqueValue("wooden-spoon");
		System.out.println(str);
	}
	
	//Remove Unique Characters from String
	
	public static String uniqueValue(String str) {
		String result ="";
		
		for(int j = 0; j < str.length(); j++) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		if (count == 1) {
			result += "" + str.charAt(j);
		}
		
	}
	return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
