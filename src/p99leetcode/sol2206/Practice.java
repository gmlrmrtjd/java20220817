package p99leetcode.sol2206;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				int val = map.get(num);
				map.put(num, val+1);
			}
			else {
				map.put(num, 1);
			}
		}
		for (Map.Entry<Integer, Integer> dual : map.entrySet()) {
			if (!(dual.getValue() % 2 == 0)) {
				return false;
			}
		}
		return true;
	}

}
