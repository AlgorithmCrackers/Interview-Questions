package hotel;

import static org.junit.Assert.*;

import org.junit.Test;

import cardStraights.CardStraights;

/*    		
    	

 */
public class HotelTest {

	@Test
	public void testMarketCost1() {
		/* 
		 10
		{1,2,3}
		{3,2,1}
		Returns: 4
		Just get 12 customers from the third city.
		*/
		int minCustomers = 10;
		int customers[] = {1,2,3};
		int cost[] = {3,2,1}; 
		assertEquals(4, Hotel.marketCost(minCustomers, customers, cost)); 
	}
	@Test
	public void testMarketCost2() {
		/* 
		10
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		Returns: 10
		It does not matter from which city you get your customers.
		*/
		int minCustomers = 10;
		int customers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int cost[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		assertEquals(10, Hotel.marketCost(minCustomers, customers, cost)); 
	}
	@Test
	public void testMarketCost3() {
		/* 
		12
		{5, 1}
		{3, 1}
		Returns: 8
		Get 10 customers from the first city, and 2 from the second city.
		*/
		int minCustomers = 12;
		int customers[] = {5, 1};
		int cost[] = {3, 1}; 
		assertEquals(1, Hotel.marketCost(1, customers, cost));
		assertEquals(2, Hotel.marketCost(2, customers, cost));
		assertEquals(3, Hotel.marketCost(4, customers, cost)); 
		assertEquals(8, Hotel.marketCost(minCustomers, customers, cost)); 
	}
	@Test
	public void testMarketCost4() {
		/* 
		100
		{9, 11, 4, 7, 2, 8}
		{4, 9, 3, 8, 1, 9}
		Returns: 45
		*/
		int minCustomers = 100;
		int customers[] = {9, 11, 4, 7, 2, 8};
		int cost[] = {4, 9, 3, 8, 1, 9}; 
		assertEquals(45, Hotel.marketCost(minCustomers, customers, cost)); 
	}
}
