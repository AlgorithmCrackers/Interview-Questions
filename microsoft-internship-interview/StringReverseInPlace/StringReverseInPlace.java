/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringReverseInPlace
{
	String reverse(char[] name, int len) {
//	int l = name.length();
	int j,i = 0;
	char temp;
	for(i = 0, j = len; i < j; i++,j--) {
		temp = name[i];	//swapping
		name[i] = name[j];
		name[j] = temp;
		}
	return name.toString();
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{	
		StringReverseInPlace pgm = new StringReverseInPlace();
		String name = "prakash";
		System.out.println(pgm.reverse(name.toCharArray(), name.length()));
	}
}
