import java.util.*;

public class Solution {
	static int coinChange(int[] s, int n, int i) {
		if (n == 0) return 1;		
		if(i == s.length || n < 0) return 0;
		return coinChange(s, n, i+1) + // not included
				coinChange(s, n-s[i], i);
	}
	public static void main(String[] args){
		int[] s = {2, 5, 3, 6};
		int n = 10;
		System.out.println(coinChange(s, n, 0));
	}	
}