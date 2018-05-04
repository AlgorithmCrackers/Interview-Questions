# Mobile Numeric Keypad Problem

## [Problem](https://www.geeksforgeeks.org/mobile-numeric-keypad-problem/):
```
Given the mobile numeric keypad. You can only press buttons that are up, left, right or down to the current button. 
You are not allowed to press bottom row corner buttons (i.e. * and # ).

Given a number N, find out the number of possible numbers of given length. 
```

## Approach:
```
1) construct the adjcency list of nearby keys
2) let dp[N][k] be the count of keys that can be pressed starting from k with count N.
3) base case: dp[1][j] = 1 for all j in range(10)
4) recursive relation: dp[i][j] = dp[i-1][j] + sum([dp[i-1][k] for k in adjacency[j])
```


## Runtime
Time : `O(N * K * 4)` here N is number of buttons pressed, K is total keys, 4 is max value in adjacency list    
Space: `O((N+1)*10)`
