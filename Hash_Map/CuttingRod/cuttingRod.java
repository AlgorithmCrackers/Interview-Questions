package CuttingRod;

import java.util.HashMap;
import java.util.Map;

public class cuttingRod {
	public static int naive(int price[], int n) {
	   if (n <= 0)
	     return 0;
	   int max_val = Integer.MIN_VALUE;
	   // Recursively cut the rod in different pieces and compare different configurations
	   for (int i = 1; i<=n; i++)
	         max_val = Math.max(max_val, price[i] + naive(price, n-i)); 
	   return max_val;
	}
	static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	public static int memoizedTopDown(int price[], int n) {
		if (cache.containsKey(n)) {
			return cache.get(n);
		}
		if (n <= 0) {
			cache.clear(); // static cache, so clear on first call
			return 0;
		}
		int max_val = Integer.MIN_VALUE;
		for (int i = 1; i<=n; i++)
			max_val = Math.max(max_val, price[i] + memoizedTopDown(price, n-i)); 
		cache.put(n, max_val);
		return max_val;
	}
}
