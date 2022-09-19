package p99leetcode;

public class Solution1684 {
	public static int countConsistentStrings(String allowed, String[] words) {
		int cnt = 0;
		for (String word : words) {
			if (consistOf(allowed, word)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	private static boolean consistOf(String allowed, String word) {
		for (int i = 0; i < word.length(); i++) {
			if(!hasChar(allowed, word.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean hasChar(String allowed, char c) {
		for (int i = 0; i < allowed.length(); i++) {
			if (allowed.charAt(i) == c) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String allowed = "abc";
		String[] a =  {"a","b","c","ab","ac","bc","abc"};
//		a = {"a","b","c","ab","ac","bc","abc"};
		System.out.println(countConsistentStrings(allowed, a));
	}
}