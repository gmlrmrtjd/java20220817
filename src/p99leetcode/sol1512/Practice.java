package p99leetcode.sol1512;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int num : nums) {
//			map.put(num, 0);
			// map 같을때 val +1 
			if (map.containsKey(num)) {
				int val = map.get(num);
				val+= 1;
//				System.out.println(map);
				map.put(num, val);
			}
			// map 다를때 key 넣어줌 
			else {
				map.put(num, 0);
			}
		}
		System.out.println(map);
		int sum = 0;
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() != 0) {
				sum += entry.getValue();
			}
		}
		return sum;
	}

}
