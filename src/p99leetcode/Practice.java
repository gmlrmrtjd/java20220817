package p99leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
	    public boolean divideArray(int[] nums) {		    
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[1])) {
				map.put(nums[i], 1);
			}
			else {
				int val = map.get(nums[i]);
				val ++;
				map.put(nums[i], val);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (!entry.getValue() % 2 == 0) {
				return false;
			}
			else {
				return true;
			}
		}
		

	}

}
