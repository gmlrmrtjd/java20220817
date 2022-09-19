package p99leetcode.Sol1748;

public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		Sum sum = new Sum();
		
		int[] nums = {1, 1, 1, 1, 1};
		
		System.out.println(practice.sumOfUnique(nums));
		
		System.out.println(Sum.sum1(practice.sumOfUnique(nums)));
	}
}
