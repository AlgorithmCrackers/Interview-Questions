Given an array of integers, find two numbers such that they sum up to a specific target.

The method `coupleSum` should return the indices of the two numbers in the array, where index1 must be less than index2.
Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

## Example:

```
Input Array : {2, 3, 4, 7}
Target      : 7
Output      : {2, 3}
```

## Complexity Analysis:

- **Time complexity** : `O(n)`. We traverse the list containing *n* elements only once. Each look up in the table costs only `O(1)` time.

- **Space complexity** : `O(n)`. The extra space required depends on the number of items stored in the hash table, which stores at most *n* elements.

### [Leetcode Problem](https://leetcode.com/problems/two-sum/)
