## Question

```
Find the algorithm to check a linked list is palindrome or not, each node contains a single character.
```

## Algorithm

* Use the concept of slow and fast pointers 
* With one small change while traversing through the list with the slow pointer load  the values onto a stack 
* Now after you reach the middle from step 1 traverse the remaining list with the slow pointer and pop each value from the stack 
* At each point these values should match if not return false or at the end return true

[Source](http://www.careercup.com/question?id=12804667)
