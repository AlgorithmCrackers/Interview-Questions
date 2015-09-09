package hotel;


/*
 *  https://community.topcoder.com/stat?c=problem_statement&pm=6254&rd=10766
 
 The hotel industry is difficult to thrive in, especially when competing at a resort city like Las Vegas. 
 Marketing is essential and often gets a large part of total revenues. 
 You have a list of cities you can market at, and a good estimate of how many customers you will get for a certain amount of money spent at each city. 

 You are given int[]s customers and cost. cost[i] is the amount of money required to get customers[i] customers from the i-th city. 
 You are only allowed to spend integer multiples of the cost for any city. 
 For example, if it costs 9 to get 3 customers from a certain city, you can spend 9 to get 3 customer, 18 to get 6 customers, 27 to get 9 customers, but not 3 to get 1 customer, or 12 to get 4 customers. 
 Each city has an unlimited number of potential customers. Return the minimum amount of money required to get at least minCustomers customers.
 
 Constraints
- minCustomers will be between 1 and 1000, inclusive.
- customers will contain between 1 and 20 elements, inclusive.
- cost will have the same number of elements as customers.
- Each element of cost and customers will be between 1 and 100, inclusive.
 */
public class Hotel {
	public static int marketCost(int minCustomers, int[] customers, int[] cost) {
		 // Avoiding out of bounds 
		int[] minSoln = new int[minCustomers+1]; // at index i store the minimum cost required to get atleast i customers
		int len = customers.length;
		for (int i = 1 ; i <= minCustomers ; i++) { // FIND ALL OPTIMAL COSTS <= MINCUSTOMERS
			minSoln[i] = Integer.MAX_VALUE;
			for (int j = 0 ; j < len ; j++) { // check all cities, find the least possible one
				int prevOptimal;
				if ((i - customers[j]) < 0) { // OUT OF BOUNDS
					prevOptimal = 0;
				} else {
					prevOptimal = minSoln[i - customers[j]]; // minSoln for customers less than i
				}
				minSoln[i] = Math.min(minSoln[i], prevOptimal + cost[j]); // it is previous optimal soln + this cost
			}
		}
		
		return minSoln[minCustomers];
	}
}
