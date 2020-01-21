# Insert Interval

![Difficulty-Hard](https://img.shields.io/badge/Difficulty-Hard-red)

Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

## Example 1:

```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
```

## Example 2:

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
```


## Complexity Analysis:

- **Time complexity** : `O(n)`. We traverse the list containing *n* elements only once. The overlap merge opration costs `O(1)` time.

- **Space complexity** : `O(n)`. The extra space is at worst case *n + 1* array space. Where there is no overlap and we return the original array and the inserted element together

### [Leetcode Problem](https://leetcode.com/problems/insert-interval/)
