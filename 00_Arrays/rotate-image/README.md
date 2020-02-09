# Rotate Image

![Difficulty-Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)

You are given an `n x n` 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

## Note:

You have to rotate the image `in-place`, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

## Example 1:

```
Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```

## Example 2:

```
Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
```

## Complexity Analysis:

- **Time complexity** : `O(n * n) - linear`. We visit all the items in the 2D matrix once.

- **Space complexity** : `O(1)`. It is done `in-place`.

### [LeetCode problem](https://leetcode.com/problems/rotate-image/)
### [YouTube - My Programming Sandbox](https://www.youtube.com/watch?v=Jtu6dJ0Cb94)
### [YouTube - Gayle Laakmann McDowell](https://www.youtube.com/watch?v=aClxtDcdpsQ)

## Explanation

- We traverse the 2D matrix layer by layer.
- Start from all four corners of the layer and then move them one by one. And swap them appropriately.

> The comments in the code have a good explanation about how we sweep layer by layer
