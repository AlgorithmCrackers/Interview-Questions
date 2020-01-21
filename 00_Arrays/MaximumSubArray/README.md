## Maximum Subarray

![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

![Dynamic Programming or Divide and conquer Technique](https://img.shields.io/badge/Technique-Dynamic_Programming_or_Divide_and_conquer-blue)

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Example:

```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

## Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

#### [LeetCode Link](https://leetcode.com/problems/maximum-subarray/)

## Complexity Analysis (Dynamic Programming - Kadane):

**See [JS Solution](JS/Kadane.js)**

- **Time complexity** : `O(n) -- linear`. We sweep through the array once.

- **Space complexity** : `O(1)`. Only two extra variables  to keep the global-max-so-far and max-subarray-sum-for-subarray-ending-at-previous-element-of-thearray.

## Complexity Analysis (Divide and conquer):

**See [JS Solution](JS/DivideAndConquer.js)**

- **Time complexity** : `O(n * log(n))`. We divide each problem by half. Making it `log(n)` steps. In each step we do `O(n)` work. Same as `merge sort` complexity analysis.

- **Space complexity** : `O(log(n))`. Stack space to keep on dividing in half. Same as `merge sort` complexity analysis.

## Complexity Analysis (Brute Force):

**See [Java Solution](Java/BackToBackSWESolution.java)**

- **Time complexity** : `O(n^2) and O(n^3)`. For each element we consider every window (subarray) that contains this element.

- **Space complexity** : `O(1)`. No extra space used

#### [YouTube - Back To Back SWE - detailed kadane explanation](https://www.youtube.com/watch?v=2MmGzdiKR9Y)
#### [geeksforgeeks - divide-and-conquer explanation](https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/)
#### [YouTube - my code school - explains all variations](https://www.youtube.com/watch?v=ohHWQf1HDfU)
