/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class DynamicSolution
{
	static int[] res;
	static int[] arr;
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 40;
		res = new int[n+1];
		arr = new int[] {1, 3, 4};
		for(int i = 0; i <= n; i++) {
			sol(n);
		}
		System.out.println(res[n]);	
	}
	static int sol(int n) {
		if(n < 0) return 0;
		if(n == 0) return 1;
		if(res[n] != 0) return res[n];
		int r = 0;
		for (int a : arr) {
			r += sol(n-a);
		}
		res[n] = r;
		return r;
	}
	
}
