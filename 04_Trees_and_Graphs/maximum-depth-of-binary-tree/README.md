# Maximum Depth of Binary Tree

![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

## Example:

```
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
```

## Complexity Analysis:

- **Time complexity** : `O(n)`. We visit each node in the tree exactly once.

- **Space complexity** : `O(log(n)) - best, o(n) worst`. The best case is for a completely balanced tree. The worst case is for an unbalanced tree. The space is to keep a recursion stack.

#### [LeetCode link](https://leetcode.com/problems/maximum-depth-of-binary-tree/)