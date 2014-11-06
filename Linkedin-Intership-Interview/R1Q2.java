/* merging a sorted array*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	
	public String[] merge(String[] array1, String[] array2) { //O(sum of length of two string)
		int m = array1.length;
		int n = array2.length;
		if(m == 0)	//no second array to merge
			return array2;
		if(n == 0) 	//no first array to merge
			return array1;
		String[] resultArray = new String[m+n];
		int i = 0,j = 0,k=0;
		while((i < m) && (j < n)) { //since the array is already sorted we are using a single while loop
			if(array1[i].compareTo(array2[j]) < 0)
			{
				resultArray[k] = array1[i];
				i++;k++;
			}
			else{
				resultArray[k] = array2[j];
				j++;k++;
			}	
		}
		while(i<m){	//store the remaining element in first array
			resultArray[k] = array1[i];
			i++;k++;
		}
		while(j<n){	//store the remaining element in first array
			resultArray[k] = array2[j];
			j++;k++;
		}
		return resultArray;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone program = new Ideone();
		String[] array1 = {"good", "person"};
    	String[] array2 = {"he", "is"};
    	assert program.merge(array1, array2) == new String[]{"good", "he", "is", "person"};
    	System.out.println("hakuna matata!!");
//    	String[] result = program.merge(array1, array2);
//    	for(int i = 0; i < result.length; i++){
//    		System.out.print(result[i] + " ");
//    	}
	}
}
