/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public<T> int distance(T[] array, T X, T Y){
		int l = array.length;
		int minDist = l;
		int i = 0;
		while(i < l) {
			if(X.equals(array[i]) || Y.equals(array[i])) {
				int j = i;
				while(j < l) {
					Boolean boolA = (X.equals(array[i]) && Y.equals(array[j]));
					Boolean boolB = (X.equals(array[j]) && Y.equals(array[i]));
					if((boolA || boolB) && minDist > Math.abs(i-j)) {
						minDist = Math.abs(i-j);
					}
					j++;
				}
			}
			i++;
		}
		return minDist;
	}
	public<T> int distanceFast(T[] array, T X, T Y) {
		int l = array.length;
		int i = 0;
		int prevI = 0;
		int minDist = l;	//initialising it to the max value(array length)
		while(i < l) {
			if(X.equals(array[i]) || Y.equals(array[i])) {
				prevI = i;
				break;
			}
			i++;
		}
		while(i < l) {
			if(X.equals(array[i]) || Y.equals(array[i])) {//check any of elements matchs again
				//check the prev element is not same as the current i
				if(!array[prevI].equals(array[i]) && minDist > Math.abs(i - prevI)) {
					minDist = Math.abs(i - prevI);
				}
				prevI = i;
				
			}
			i++;
		}
		return minDist;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone program = new Ideone();
		String[] arrayS = {"the", "quick", "brown", "fox", "quick"};
		assert program.distance(arrayS, "fox", "the") == 3;
		assert program.distance(arrayS, "quick", "fox") == 1;
		assert program.distanceFast(arrayS, "fox", "the") == 3;
		assert program.distanceFast(arrayS, "quick", "fox") == 1;
		Integer[] arrayInt = {1, 2, 3, 1};
		assert program.distance(arrayInt, 2, 3) == 1;
		assert program.distanceFast(arrayInt, 2, 3) == 1;
	}
}
