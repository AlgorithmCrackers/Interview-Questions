import java.util.*;
import java.lang.*;
import java.io.*;


class Solution
{
	private static void permute(String cur, String pend) {
		if(pend.length() == 0) {
			System.out.println(cur);
			return;
		}
		for(int i = 0; i < pend.length(); i++) {
			String c = cur + pend.substring(i, i+1);
			String p = pend.substring(0,i) + pend.substring(i+1, pend.length());
			permute(c,p);
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "ABC";
		permute("", str); // prints all permutations
	}
}
