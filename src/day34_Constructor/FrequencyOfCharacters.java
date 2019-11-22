package day34_Constructor;

import java.util.ArrayList;

public class FrequencyOfCharacters {

	
	
		  
		
		 
		 
	public static void main(String[] args) {
		//task01
		String a = removeDup("aabbccddef");
		System.out.println(a);
		System.out.println(removeDup("aabbccddef"));
		
		//task02
		int b = count("madina adrien ava", "a");
		System.out.println(b);
		
		//task03
		System.out.println(frequency("madina"));
		
		//task04/05
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(10000);
		int maxnum = maximum(list);
		System.out.println(maxnum);//10000
		
		int minnum = minimum(list);
		System.out.println(minnum);//10


	}
	
	
	
	
	// 1. write  a return method that can remove duplicates from a string
	//   Ex: RemoveDup("abcabc") ==> returns "abc";
	
	public static String removeDup(String str ) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(!result.contains(str.substring(i, i+1) ) ) {
				result += str.substring(i, i+1);
			}
		}
			return result;
	}
	
	
	
	// 2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
	 // Ex: count("abcaba", "a")  ==> returns 3 ;
	
	public static int count(String a, String b) {
		int count = 0;
		while(a.contains(b)) {
			count++;
			a = a.replaceFirst(b, "");
		}
		
		
		
		return count;
	}
	
	
	
	 //3. use the above two methods to write a new method that can find the frequency of characters
	 //Ex: frequency("aabcabcabc") ==>a4b3c3
	
	public static String frequency (String str) {
		String nonDup = removeDup(str);
		String result = "";
		for(int i=0; i < nonDup.length(); i++) {
		int count = count(str, ""+nonDup.charAt(i) );
		result += ""+nonDup.charAt(i)+count+" ";
		}
		
		
		return result;
	}
	
	
//  4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
	public static int maximum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for(int each: list) {
			if(each > max ) {
				max = each;
			}
			
		}
		return max;
		
		
	}
	
	
	 //  5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)

	public static int minimum (ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		
		for(int each: list) {
			if(each < min) {
				min = each;
			}
		}
		return min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
