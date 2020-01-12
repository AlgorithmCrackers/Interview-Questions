# Reverse Linked List

Reverse a singly linked list.

## Example:

```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
```

### Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

## Complexity Analysis (Iterative):

- **Time complexity** : `O(n)`. We traverse the linked-list containing *n* elements only once. The swap operation costs `O(1)` time.

- **Space complexity** : `O(1)`. The extra space is only the one to store the result and the one temporary variable inside the loop.

## Complexity Analysis (Recursive):

- **Time complexity** : `O(n)`. We traverse the linked-list containing *n* elements only once. The swap operation costs `O(1)` time.

- **Space complexity** : **`O(n)`**. The extra space is the stack space. When reaching the last part of the linked-list the whole stack upto the previous node is stored.

### [Leetcode Problem](https://leetcode.com/problems/reverse-linked-list/)
