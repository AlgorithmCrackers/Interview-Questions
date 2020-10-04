# Contains Duplicate

`Easy`

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

## Example 1:

```
Input: [1,2,3,1]
Output: true
```

## Example 2:
```
Input: [1,2,3,4]
Output: false
```

## Example 3:

```
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
```

## Complexity Analysis (sorting approach):

- **Time complexity** : `O(n log n)`. Sorting is the expensive part. The iteration/sweeping otherwise happens in `O(n)`

- **Space complexity** : **`O(1)`**. If `heapsort` is used, space complexity will be `O(1)`

## Complexity Analysis (HashSet approach):

- **Time complexity** : **`O(n))`**. We do `has()` and `add()` operations on the hash-set for `n` times and each operation takes constant time.

- **Space complexity** : `O(n)`. The space complexity of the Hash-Set with max of `n` items.

## Note

For certain test cases with not very large `n`, the runtime of **HashSet approach can be slower than sorting approach**. The reason is hash table has some overhead in maintaining its property. One should keep in mind that real world performance can be different from what the Big-O notation says. The Big-O notation only tells us that for sufficiently large input, one will be faster than the other. Therefore, when `n` is not sufficiently large, an `O(n)` algorithm can be slower than an `O(n log n)` algorithm.

#### [LeetCode link](https://leetcode.com/problems/contains-duplicate/)
