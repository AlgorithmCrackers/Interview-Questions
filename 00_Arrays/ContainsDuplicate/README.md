## Contains Duplicate

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

## Solution

Use Hashmap to store the indices of occurrences. Then find if it occurs again.
