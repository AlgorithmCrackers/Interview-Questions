/** 
 * Given a set of distinct integers, S, return all possible subsets. 
 *  
 * Note: Elements in a subset must be in non-descending order. The solution set 
 * must not contain duplicate subsets. For example, If S = [1,2,3], a solution 
 * is: 
 *  
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ] 
 */ 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Subsets
{
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        int len = S.length;
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        //subsets.add(new ArrayList<Integer>());	//for adding the empty list
        for(int i = 0; i < Math.pow(2,len); i++) {	//O( len*len) not sure
            int count = 0, t = i;
            ArrayList<Integer> subset = new ArrayList<Integer>();
            while(t != 0) {
                if((t & 1) != 0) {
                    subset.add(S[count]);
                }
                count++;
                t = t >> 1;
            }
            subsets.add(subset);
        }
        return subsets;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Subsets program = new Subsets();
		int[] S = {1,2,3};
		ArrayList<ArrayList<Integer>> result = program.subsets(S);
		for(ArrayList<Integer> subset: result) {
			System.out.print("[ ");
			for(Integer element:subset) {
				System.out.print(element + ", ");
			}
			System.out.println("]");
		}
	}
}
