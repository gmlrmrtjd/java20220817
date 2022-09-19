package p99leetcode.Sol1748;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
	public Map<Integer, Integer> sumOfUnique(int[] nums) {
		// key : number
		// value : 몇개
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				// map에 있으면
				int val = map.get(num);
				val++;

				map.put(num, val);
			} else {
				// map에 없으면
				map.put(num, 1);
			}
		}

//		int sum = 0;
//		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//		for (Map.Entry<Integer, Integer> entry : entries) {
//			if (entry.getValue() == 1) {
//				sum += entry.getKey();
//			}
//		}

		return map;
	}
}


