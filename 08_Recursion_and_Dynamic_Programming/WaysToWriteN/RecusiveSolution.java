
import java.util.*;
import java.lang.*;
import java.io.*;


class RecusiveSolution
{
	static int cnt;
	static int[] arr;
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 40;
		cnt = 0;
		arr = new int[] {1, 3, 4};
		sol(n);
		System.out.println(cnt);
	}
	
	static void sol(int n) {
		if(n < 0) return;
		if(n == 0) {
			cnt++;
			return;
		}
		for(int a : arr) {
			sol(n-a);
		}
	}
}
