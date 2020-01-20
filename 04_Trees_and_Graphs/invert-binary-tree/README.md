# Invert Binary Tree

![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

Invert a binary tree.

## Example:

```
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

## Complexity Analysis:

- **Time complexity** : `O(n)`. Since each node in the tree is visited only once, the time complexity is `O(n)`, where `n` is the number of nodes in the tree. We cannot do better than that, since at the very least we have to visit each node to invert it.

- **Space complexity** : `O(h) where h is height, or O(log(n)) - best, o(n) worst`. `O(h)` function calls will be placed on the stack in the worst case, where `h` is the height of the tree. Because `h ∈ O(n)`, the space complexity is `O(n)` (worst case). The best case is for a completely balanced tree. The worst case is for an unbalanced tree.

#### [LeetCode link](https://leetcode.com/problems/invert-binary-tree/)

> Look at solution 2 in leetcode for a queue based approach with the same time and space complexities