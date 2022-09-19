package p99leetcode.sol287;

import java.util.HashSet;
import java.util.Set;

public class Practice {
	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}

		return 1999999;
	}
}
