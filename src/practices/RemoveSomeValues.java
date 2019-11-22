package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,105,205,300,10,25, -5, -10));
	ArrayList<Integer> nums2 = new ArrayList<>();
	
	for(int each: nums) {
		if(each < 0) {
			nums2.add(each);
			//nums = nums2;
		}
		
	}
	System.out.println(nums2);
	
	
	
}
}