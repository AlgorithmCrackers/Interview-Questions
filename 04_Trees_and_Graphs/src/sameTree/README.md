**How to check whether a binary tree is identical to another binary tree? What is the time complexity?**

## Solution

Recursively verify for each node in both trees,
  - if they are null, they are identical
  - if both are not null, are their data equal?, if so recurse
  - if one is empty and other is not, then they are non-identical

Time complexity: `O(n)`
