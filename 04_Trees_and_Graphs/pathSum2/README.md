
**Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.**

[LeetCode Link](https://leetcode.com/problems/path-sum-ii/)

Note: A leaf is a node with no children.

Example:

```
Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
```

## Solution

Subtract the node value from the sum when recurring down, and check to see if the sum is the node value when you reach the leaf.