package day30_WrapperClass_ArrayList;

public class ReturnMethodRemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = revDup("madina adrien");
		System.out.println(str);
	}
	
	// Return Method that accepts the String and remove duplicates
	
	public static String revDup (String str) {
		String result ="";
		for(int i = 0; i < str.length(); i++) {
			if(!result.contains(str.substring(i, i+1 ) ) ) {
				result += str.substring(i, i+1);
			}
		}
		return result;
	}
	
	
}
