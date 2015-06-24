package tallPeople;

import java.util.Arrays;
// http://community.topcoder.com/stat?c=problem_statement&pm=2923&rd=5854
public class TallPeople {
	public static int[] getPeople(String[] people) { //O(RC)
		int tallestOfShortest = Integer.MIN_VALUE; // row
		int shortestOfTheTallest = Integer.MAX_VALUE; // column
		int[] tallest = new int[people[0].split(" ").length]; //O(C)
		Arrays.fill(tallest, Integer.MIN_VALUE);
		for (String row: people) { //O(R)
			int shortest = Integer.MAX_VALUE;
			String[] l  = row.split(" ");
			for (int i=0; i<l.length; i++) {//O(C)
				int hei = Integer.parseInt(l[i]);
				tallest[i] = Math.max(tallest[i], hei);
				shortest = Math.min(shortest, hei);
			}
			tallestOfShortest = Math.max(tallestOfShortest, shortest);
		}
		for (int tall: tallest) { //O(C)
			shortestOfTheTallest = Math.min(shortestOfTheTallest, tall);
		}
		return new int[]{tallestOfShortest, shortestOfTheTallest};
	}
	public static void main (String[] args) throws java.lang.Exception {
		System.out.println(Arrays.toString(getPeople(new String[]{"9 2 3", "4 8 7"})));
	}
}
