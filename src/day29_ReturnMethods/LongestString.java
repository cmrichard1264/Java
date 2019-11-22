package day29_ReturnMethods;

public class LongestString {

	public static void main(String[] args) {
		
		String [] arr = {"Madina", "Suna", "Mukhtar", "Viktoria", "Cybertek", "Batch12 Javengers"};
		String longestWord = words(arr);
		System.out.println(longestWord);
	}
	
	
	
	
	
	
	
	public static String words (String[] arr) {
		int max = 0;
		String longestWord = "";
		for(String each: arr) {
			if(each.length() > max) {
				max = each.length();
				longestWord = each;
			}
		}
		return longestWord;
	}
	
	
	
	
}
