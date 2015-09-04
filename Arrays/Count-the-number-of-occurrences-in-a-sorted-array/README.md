Count the number of occurrences in a sorted array
```
  Given a sorted array arr[] and a number x,
  write a function that counts the occurrences of x in arr[]. 
```

[Source](http://goo.gl/4cpGcs)

Time Complexity: O(Logn)

Programming Paradigm: Divide & Conquer

## Solution
  
  1. Use Binary search to get index of the first occurrence of x in arr[]. Let the index of the first occurrence be i.
  2. Use Binary search to get index of the last occurrence of x in arr[]. Let the index of the last occurrence be j.
  3. Return (j – i + 1);
