/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	//generic type which can be used for any array type
	public<T> int Distance(T[] array, T X, T Y){	//O(n^2)
		int l = array.length;
		int minDist = l;
		int i = 0;
		while(i < l) {
			if(X.equals(array[i]) || Y.equals(array[i])) {
				int j = i;
				while(j < l) {
					Boolean boolA = (X.equals(array[i]) && Y.equals(array[j]));
					Boolean boolB = (X.equals(array[j]) && Y.equals(array[i]));
					if((boolA || boolB) && minDist > Math.abs(i-j)) {	//update the minDist
						minDist = Math.abs(i-j);
					}
					j++;
				}
			}
			i++;
		}
		return minDist;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone program = new Ideone();
		String[] arrayS = {"the", "quick", "brown", "fox", "quick"};
		System.out.println( program.Distance(arrayS, "fox", "the"));	//3
		Integer[] array = {1, 2, 3, 1};
		System.out.println( program.Distance(array, 1, 3));	//1
		
	}
}
