package cardStraights;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardStraightsTest {
	
	@Test
	public void testLongestStraightBase() {
		/*	
		Base case
		*/
		assertEquals(0, CardStraights.longestStraight(new int[]{}));
	}
	@Test
	public void testLongestStraight1() {
		/*	
		{0,6,5,10,3,0,11}
		Returns: 5
		You can make 3-4-5-6-7 using one of your jokers as a 4 and the other one as a 7.
		*/
		assertEquals(5, CardStraights.longestStraight(new int[]{0,6,5,10,3,0,11}));
	}
	@Test
	public void testLongestStraight2() {
		/*    	
		{100,100,100,101,100,99,97,103}
		Returns: 3
		Not a very lucky hand.
		*/	
		assertEquals(3, CardStraights.longestStraight(new int[]{100,100,100,101,100,99,97,103}));
	}	
	@Test
	public void testLongestStraight3() {
	    /*
		{0,0,0,1,2,6,8,1000}
		Returns: 6
		You can make 1-2-3-4-5-6 using your jokers cleverly.
		*/
		assertEquals(6, CardStraights.longestStraight(new int[]{0,0,0,1,2,6,8,1000})); 
	}
	@Test
	public void testLongestStraight4() {
	    /*
		{1,9,5,7,3,4,0,0,0,10}
		Returns: 10
		*/
		assertEquals(10, CardStraights.longestStraight(new int[]{1,9,5,7,3,4,0,0,0,10})); 
	}
	@Test
	public void testLongestStraight5() {
		/*	
		{0,0,1,2}
		Returns: 4
		Edge case where both jokers has to go the end
		*/
		assertEquals(4, CardStraights.longestStraight(new int[]{0,0,1,2}));
	}
	@Test
	public void testLongestStraight6() {
		/*	
		{0,0}
		Returns: 2
		Edge case where only jokers are there
		*/
		assertEquals(2, CardStraights.longestStraight(new int[]{0,0}));
	}

}
