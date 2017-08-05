package info.santhosh.interview;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int reverseInt(int x) {
		int rev = 0;
	  	while(x != 0){
			rev = rev*10 + x%10;
			x = x/10;
	  	} 
	  	return rev;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(reverseInt(321));
		System.out.println(reverseInt(-321));
		System.out.println(reverseInt(0));
		/*
		123
		-123
		0
		*/
	}
}
