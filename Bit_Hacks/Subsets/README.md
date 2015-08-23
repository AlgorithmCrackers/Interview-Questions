## Question

````
Given a set of distinct integers, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```

#### Algorithm:
BitManipulation

```
if the length of array is 3. binary value of 0 to 2^3-1 contain all posible combinations
1 1
2 10
3 11
4 100
5 101
6 110
7 111
```
