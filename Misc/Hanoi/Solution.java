/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	static void hanoi(int height, int first, int temp, int final1)
	{
	    if (height <= 0) return;
	    hanoi (height-1, first, final1, temp);
	    System.out.println("Move disk "+ height +" from " + first +" to "+final1);
	    hanoi (height-1, temp, first, final1);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		hanoi(3,1,2,3);
	}
}
