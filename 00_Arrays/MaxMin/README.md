## Find Maximum and Minimum in an array.

#### First Solution:
```
Traverse through the array to get the minimum element. (Time Complexity - O(n); Number of comparitions: n-2)
Traverse second time to get the maximum element.  (Time Complexity - O(n); number of comparitions: n-2)
```

#### Second Solution:
Let us consider 4 elements x1, x2, x3, x4

![maxmin diagram](https://cloud.githubusercontent.com/assets/3127498/17457773/331e1bc6-5bcf-11e6-8bd3-1645cec1988b.png)
 
 The maximum and minimum can be obtained by just 4 comparitions for 4 elements.
 
 Strategy used: **Divide and Conquer**
 
 **Time Complexity: 3n/2 - 2**
 
 source: 
[Design & Analysis of Algorithms by Prof.Abhiram Ranade](http://www.nptelvideos.in/2012/11/design-analysis-of-algorithms.html)

[Working example of source code(I am not sure if it is a permenent link. just copy paste in Ideone.com and it will work fine)](https://ideone.com/YyCbiR)
