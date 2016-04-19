/* 
Reverse the string without having any additional data structure

PS: here I did use a single character as a temp(which is the only additional data structure)
@author: prakashn27
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class StringReverseInPlace
{
	char[] reverse(char[] name, int len) {
		//	int l = name.length();
		int j,i = 0;
		char temp;
		for(i = 0, j = len; i < j; i++,j--) {
			temp = name[i];	//swapping
			name[i] = name[j];
			name[j] = temp;
		}
		/* To return a string use 
		return new String(name); */
		return name;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{	
		StringReverseInPlace pgm = new StringReverseInPlace();
		String name = "prakash";
		System.out.println(pgm.reverse(name.toCharArray(), 
		name.length()-1));//sending the length-1 as array index is one less than the total length
	}
}
