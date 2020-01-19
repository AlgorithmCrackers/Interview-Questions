# Same Tree

![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

## Example 1:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

## Example 2:

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

## Example 3:

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## Complexity Analysis:

- **Time complexity** : `O(2n) = O(n)`. where `n` is a number of nodes in a tree. We visit each node in both trees exactly once.

- **Space complexity** : `O(log(n)) - best, o(n) worst`. The best case is two completely balanced trees. The worst case is two completely unbalanced trees, to keep a recursion stack.

#### [LeetCode link](https://leetcode.com/problems/same-tree/)