package CuttingRod;

import static org.junit.Assert.*;

import org.junit.Test;

public class cuttingRodTest {
	int clrsArr[] = {0, 1, 5, 8, 9, 10, 17, 17, 20}; //pg 361 - p[i] = price of rod of length i
	@Test
	public void testNaive() {
		assertEquals(10, cuttingRod.naive(clrsArr, 4));
	}
	@Test
	public void testMemoizedTopDown() {
		assertEquals(10, cuttingRod.memoizedTopDown(clrsArr, 4));
	}

}
