public class MaxHeap {
	int[] arr;
	int N;

	public MaxHeap(int capacity) {
		arr = new int[capacity + 1];
		N = 0;
	}
	
	public void insert(int value) {
		arr[++N] = value;
		swim(N);
	}
	
	public int deleteMax() {
		swap(N, 1, arr);
		
		int max = arr[N];
		arr[N] = 0;
		N--;
		sink(1);
		return max;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	private int max(int a, int b) {
		return (a>b) ?a : b;
	}
	
	/*
	 * swim max to top
	 */
	private void swim(int index) {
		while(arr[index] > arr[index/2] && index != 0 && index/2 != 0) {
			swap(index, index/2, arr);
			index = index/2;
		}
	}
	
	/*
	 * Sink the element from top to bottom
	 */
	private void sink(int index) {
		while(index < N) {
			int childIndex = 2 * index;
			int maxChildIndex = (arr[childIndex] > arr[childIndex + 1])?childIndex :(childIndex + 1);
			if(arr[index] > arr[maxChildIndex]) {
				break;
			}
			//System.out.println("max child index :" + maxChildIndex);
			swap(index, maxChildIndex, arr);
			index = maxChildIndex;
		}
	}
	
	/*
	 * swaps entries between two index in arr
	 */
	private void swap(int index1, int index2, int[] arr) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	/*
	 * diplays elements of queue
	 */
	public void display() {
		for(int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MaxHeap h = new MaxHeap(20);
		int[] arr = {1, 23, 12, 9, 30, 2, 50}; 
		for(int i = 0; i < arr.length; i++) {
			h.insert(arr[i]);
		}
		System.out.println("first highest element is " + h.deleteMax());
		System.out.println("second highest element is " + h.deleteMax());
		System.out.println("third highest element is " + h.deleteMax());
	}

}
