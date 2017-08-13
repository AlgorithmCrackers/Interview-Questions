import java.util.*;
class Solution {
	public static int[] coupleSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i=0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}

		for (int i=0; i < numbers.length; i++) {
			int num = target - numbers[i];
			if (map.containsKey(num)) {
				int j = map.get(num);
				return new int[] {i+1, j+1};
			}
		}

		return new int[] {-1,-1};
	}
}
