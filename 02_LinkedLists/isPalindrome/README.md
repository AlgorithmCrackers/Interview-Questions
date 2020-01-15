# Palindrome Linked List

`Easy`

Given a singly linked list, determine if it is a palindrome.

## Example 1:

```
Input: 1->2
Output: false
```

## Example 2:

```
Input: 1->2->2->1
Output: true
```

## Follow up:
Could you do it in O(n) time and O(1) space?

## Complexity Analysis:

- **Time complexity** : `O(n)`. We traverse the linked-list containing *n* elements only once. The reverse operation costs `O(n/2)` time. Totally it is `O(n) + O(n/2) = O(n)`

- **Space complexity** : `O(1)`. The extra space is only the variables for fast and slow pointer. Also the reverse operation takes `O(1)` time

#### [LeetCode link](https://leetcode.com/problems/palindrome-linked-list/)
#### [YouTube explanation](https://www.youtube.com/watch?v=wk4QsvwQwdQ)
