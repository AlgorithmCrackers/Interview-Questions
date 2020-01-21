# Transpose Matrix

![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

## Example 1:

```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
```

## Example 2:

```
Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```

## Complexity Analysis:

- **Time complexity** : `O(n * n) - linear`. We visit all the items in the 2D matrix once.

- **Space complexity** : `O(n * n)`. We create a new 2D array with the same number of elements as the input.

> Note:  for a n x n array, we can do the same solution in-place. So the space-complexity for that is O(1)

### [LeetCode problem](https://leetcode.com/problems/transpose-matrix)
### [Youtube Explanation](https://www.youtube.com/watch?v=VDw9y6nX_ss)

![Example](https://assets.leetcode.com/uploads/2019/10/20/hint_transpose.png)