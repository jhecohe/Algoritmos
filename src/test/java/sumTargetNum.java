import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class sumTargetNum {

	@Test
	void returnIndexesSum() {
		/*
		 * 2. Given an array of integers "nums" and an integer "target", return indices of the two numbers such that they add up to "target".

			You may assume that each input would have exactly one solution, and you may not use the same element twice.
Ï
			You can return the answer in any order.

			Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1]
			Example 1: Input: nums = [2,7,11,15], target = 22 Output: [1,3]
				
				 	
			Example 2: Input: nums = [2,5,4], target = 6 Output: [2,0]
		 * */
		
		int target = 22;
		
		int[] numbers = new int[]{2,7,11,15};
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			numMap.put(numbers[i], i);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int numToFind = target - numbers[i];
			if(numMap.containsKey(numToFind) && numMap.get(numToFind) != i) {
				System.out.println(numMap.get(numToFind)+":"+i);
				break;
			}
		}
	}
}
