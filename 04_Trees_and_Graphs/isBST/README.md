**Write a program to verify whether the given tree is a binary search tree.**

## Recursive solution

For each node,
  - check if it satisfies min/max constraint
  - Check recursively for its left and right subtrees
    - For left subtree, the node's data is its max
    - For right subtree, the node's data is its min

Time complexity - `O(n)`
