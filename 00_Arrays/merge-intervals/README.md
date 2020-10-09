# Merge Intervals

![Medium difficulty](https://img.shields.io/badge/difficulty-medium-yellow)

## Example 1:

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
```

## Example 2:

```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
```

## Constraints:

```
intervals[i][0] <= intervals[i][1]
```

## Complexity Analysis:

- **Time complexity** : `O(n * log(n))`. Other than the `sort` invocation, we do a simple linear scan of the list, so the runtime is dominated by the `O(n * log(n))` complexity of sorting.

- **Space complexity** : `O(1) or O(n)`. If we can sort intervals in place, we do not need more than constant additional space. Otherwise, we must allocate linear space to store a copy of intervals and sort that. The space for answer array is not counted. If counted, it is O(n).

### [Leetcode Problem](https://leetcode.com/problems/merge-intervals/)
