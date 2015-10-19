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
  3. Return (j – i + 1

- [Binary search in Java by princeton](http://algs4.cs.princeton.edu/11model/BinarySearch.java.html)

## NOTE

```
Instead of mid=(hi+lo)/2

Write, mid=lo+(hi-lo)/2
```

- [To avoid overflow!](http://stackoverflow.com/questions/25571359/why-we-write-lohi-lo-2-in-binary-search)
- [Google also says that](http://googleresearch.blogspot.fr/2006/06/extra-extra-read-all-about-it-nearly.html)
  
