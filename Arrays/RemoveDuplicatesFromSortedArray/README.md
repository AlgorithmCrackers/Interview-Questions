# Remove Duplicates from Sorted Array

[See in 
LeetCode](https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/)

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = `[1,1,2]`,

Your function should return length = `2`, and A is now `[1,2]`.

## Solution

Using Loop invariant this can be solved.

We have to get a pointer to the array, which is such that we know that the array elements till that pointer are all unique.

### Issues
If the input array is {1, 2, 2, 3, 3}, the array will be changed to {1, 2, 3, 3, 3}.

Since we return the length of the new array too, the answer passes the leetcode test cases.
