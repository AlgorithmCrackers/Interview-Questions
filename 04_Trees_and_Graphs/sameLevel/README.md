**Check if all the leaves are at the same level in a binary tree**

## Solution (Recursive)
- Use a static variable which will be set with the level of leaf node, when we encounter a leaf node for the first time.
- Every time we see a leaf node we check whether the level of this leaf node is same as the one set in the static variable
  - If no, return false
  - else continue till all the other leaf nodes are seen.
