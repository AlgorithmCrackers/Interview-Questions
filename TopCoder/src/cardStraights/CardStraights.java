package cardStraights;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* https://community.topcoder.com/stat?c=problem_statement&pm=7417&rd=10661
 * Problem Statement
    	
You are playing a card game where the goal is to make straights. Each card in the deck has a number between 1 and 1000000, inclusive.
 A straight is a sequence of cards with consecutive values. Values do not wrap around, so 1 does not come after 1000000. 
 In addition to regular cards, the deck also contains jokers. Each joker can be used as any valid number (between 1 and 1000000, inclusive).

You will be given a int[] cards containing the cards in your hand.
Jokers are represented by 0s, and other cards are represented by their values. 
Return the number of cards in the longest straight that can be formed using one or more cards from your hand.

Constraints
- cards will contain between 1 and 50 elements, inclusive.
- Each element of cards will be between 0 and 1000000, inclusive.
 
 */
public class CardStraights {
	
	public static int longestStraight(final int[] cards) {
		// get only unique values, find the no of jokers and make them sorted
		SortedSet<Integer> set = new TreeSet<Integer>();
		int jokersCount = 0;
		for (int c: cards) {
			if (c != 0)
				set.add(c);
			else
				jokersCount++;
		}
		Integer[] sortedCards = set.toArray(new Integer[set.size()]);
		// Find max 
		int max = 0;
		for(int i=0; i < sortedCards.length; i++) {
			int diff = 0;
			int j;
			for(j=i+1; j < sortedCards.length; ) { // find the max straight with this card
				diff = diff + sortedCards[j] - sortedCards[j-1] - 1; // total difference observed
				if(diff <= jokersCount) // can this difference be filled by jokers?
					j++; // go to next card
				else break;
			}
			final int thisStraight = j-i;
			// update max if necessary
			if (max < thisStraight)
				max = thisStraight;
		}
		return max + jokersCount;
	}

	public static void main(String[] args) {
		CardStraights.longestStraight(new int[]{1,9,5,7,3,4,0,0,0,10});
	}

}
