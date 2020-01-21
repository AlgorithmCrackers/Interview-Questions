# Maximum Product Subarray

![Medium difficulty](https://img.shields.io/badge/difficulty-medium-yellow)

![Dynamic Programming Technique](https://img.shields.io/badge/Technique-Dynamic_Programming-blue)

Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

## Example 1:

```
Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```

## Example 2:

```
Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
```

## Complexity Analysis:

- **Time complexity** : `O(n) - linear`. We sweep the array once.

- **Space complexity** : `O(1)`. We use 3 extra variables for global max, and the previous subarray max/min sums.