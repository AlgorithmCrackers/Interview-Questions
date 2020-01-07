# Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

[Leetcode link](https://leetcode.com/problems/merge-two-sorted-lists/)

## Example:

```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```

## Solution

The key to solve the problem is defining a **fake head**. Then compare the first elements from each list. Add the smaller one to the merged list. Finally, when one of them is empty, simply append it to the merged list, since it is already sorted.

## Complexity Analysis:

- **Time complexity** : `O(n)`. We traverse each the lists only once. Each comparision for minimum costs only `O(1)` time.

- **Space complexity** : `O(1)`. The extra space required is only the fake node.
