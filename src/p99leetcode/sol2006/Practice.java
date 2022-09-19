package p99leetcode.sol2006;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
	public int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num, 0);
		}
//		System.out.println(map);
		for (int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				// i와 j의 차가 2 or -2 일 때 
				if (nums[i]-nums[j] == k || nums[i]-nums[j] == -k) {
					int val = map.get(nums[i]);
					val++;
					System.out.println("nums[i]: "+ nums[i] );
					System.out.println("nums[j]: " + nums[j]);
					System.out.println("val : " + val);
					map.put(nums[i], val);
				}
			}
		}
		int cnt = 0;		
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		System.out.println(entries);
		for(Map.Entry<Integer, Integer> entry : entries) {
			cnt += entry.getValue();
		}
		return cnt;
	}
}
