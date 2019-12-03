package practices;

import java.util.Arrays;

public class StringAnagram {
	
	public static boolean isAnagram(String word1, String word2) {
		
		if(word1.length()==word2.length()) {
			char[] arr1 = word1.toLowerCase().replace(" ", "").toCharArray();
			char[] arr2 = word2.toLowerCase().replace(" ", "").toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i = 0; i < arr1.length; i++) {
				if(arr1[i] == arr2[i]) {
					return true;
				}
			}
		}return false;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("Madina", "Adinam"));
	}
}
