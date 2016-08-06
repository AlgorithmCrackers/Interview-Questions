import java.util.*;
import java.lang.*;
import java.io.*;
class Pair {
	Pair() {
		
	}
	Pair(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Min :").append(min);
		sb.append("   Max :").append(max);
		return sb.toString();
	}
	
	public int min, max;
}


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	public Pair findMinMax(int[] a, int left, int right) {
		if(left > right) return null;
		if(left == right) return new Pair(a[left], a[left]);
		if((right - left) == 1) {
			//only two elements
			if(a[left] > a[right]) {
				return new Pair(a[right], a[left]);
			} else {
				return new Pair(a[left], a[right]);
			}
		}
		// find left maxmin and right maxmin
		int mid = (left+right)/2;
		Pair leftmaxmin = findMinMax(a, left, mid);
		Pair rightmaxmin = findMinMax(a, mid+1, right);
		Pair result = new Pair();
		if(leftmaxmin.min < rightmaxmin.min) 
			result.min = leftmaxmin.min;
		else 
			result.min = rightmaxmin.min;
		
		if(leftmaxmin.max > rightmaxmin.max)
			result.max = leftmaxmin.max;
		else
			result.max = rightmaxmin.max;
		
		return result;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = {1, 2, 3, 4, 8, 7, 6, 5, 100, 0};
		Ideone pgm = new Ideone();
		Pair minmax = pgm.findMinMax(a, 0, a.length-1);
		// Pair minmax = new Pair(5,1);
		System.out.println(minmax);
	}
}
