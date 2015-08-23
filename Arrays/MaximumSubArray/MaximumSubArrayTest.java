package maximumSubArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubArrayTest {
	final int[] clrs = new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7}; // pg 70
	@Test
	public void testBrute() {
		assertEquals(43, MaximumSubArray.brute(clrs, 0, clrs.length-1));
	}

	@Test
	public void testBruteOptimal() {
		assertEquals(43, MaximumSubArray.bruteOptimal(clrs, 0, clrs.length-1));
	}
	
	@Test
	public void testDivideAndConquer() {
		assertEquals(43, MaximumSubArray.divideAndConquer(clrs, 0, clrs.length-1));
	}
}
