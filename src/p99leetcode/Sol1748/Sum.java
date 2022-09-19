package p99leetcode.Sol1748;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sum  {
	public static int sum1(Map<Integer, Integer> map) {
		Map<Integer, Integer> map2 = new HashMap<>();
		
		int sum = 0;
		Set<Map.Entry<Integer, Integer>> entries = map2.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() == 1) {
				sum += entry.getKey();
			}
		}

		return sum;
	}
}
