package p99leetcode;

public class Solution1672 {
	    public int maximumWealth(int[][] accounts) {
	        int sum = 0;
	        for (int i = 0; i < accounts.length; i++) {
	      	  int jsum = 0;
	      	  for (int j = 0; j < accounts[i].length; j++) {
	      		  jsum = jsum + accounts[i][j];
	      	  }
	      	  if (sum < jsum) {
	      		  sum = jsum;
	      	  }
	        }
	        return sum;  
	}
}
