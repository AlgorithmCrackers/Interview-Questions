package maximumSubArray;

public class MaximumSubArray {
	public static int brute(final int[] a, final int start, final int end) { // O(n^3)
		int n = a.length;
		int max = Integer.MIN_VALUE;
		for(int sub_array_size=1; sub_array_size<=n; sub_array_size++) { // for each sub-array size
			for(int start_index=0; start_index<n; start_index++) { // for each element
				if(sub_array_size+start_index > n) break; // subarray exceeds bounds
				int sum=0;
				for(int i=start_index; i<start_index+sub_array_size; i++) {
					sum += a[i];
				}
				max = Math.max(sum, max);
			}
		}
		return max;
	}
	public static int bruteOptimal(final int[] a, final int start, final int end) { // O(n^2)
		int n = a.length;
		int max = Integer.MIN_VALUE;
		for(int start_index=0; start_index<n; start_index++) { // for each element
			int sum = 0;
			for(int sub_array_size=1; sub_array_size<=n; sub_array_size++) { // for each sub-array size
				if(sub_array_size+start_index > n) break; // subarray exceeds bounds
				sum += a[start_index+sub_array_size-1]; /* Use the sum of previous subarray  and add with last element of this subarray */
				max = Math.max(sum, max);
			}
		}
		return max;
	}
	public static int divideAndConquer(final int[] a, final int start, final int end) { // O(nlgn) - https://www.youtube.com/watch?v=ohHWQf1HDfU
		if(start == end)
			return a[start];
		final int mid = (start+end)/2;
		int leftMSS = divideAndConquer(a, start, mid);
		int rightMSS = divideAndConquer(a, mid+1, end);
		// max mid crossing subarray
		int sum = 0;
		int leftmax = Integer.MIN_VALUE;
		for(int i=mid; i>=start; i--) { // left side
			sum += a[i];
			leftmax = Math.max(sum, leftmax);
		}
		sum = 0;
		int rightmax = Integer.MIN_VALUE;
		for(int i=mid+1; i<=end; i++) {
			sum += a[i];
			rightmax = Math.max(sum, rightmax);
		}
		return Math.max(leftmax+rightmax, Math.max(leftMSS, rightMSS));
	}

}
