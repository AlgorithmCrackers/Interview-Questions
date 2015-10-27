**Given an integer x and an unsorted array of integers, describe an algorithm to determine whether two of the numbers add up to x. (In this case, say that the interviewer hates hash tables.)**

## Solution

- Good Answer : Sort the array. Then, keep track of two pointers in the array, one at the beginning and one at the end. Whenever the sum of the current two integers is less than x, move the first pointer forwards, and whenever the sum is greater than x, move the second pointer backwards. If you cannot find two numbers that add to x before one of the pointers meet, then there is no pair of integers that sum to x. This solution takes `O(nlogn)` time because we sort the numbers.

- Another Good Answer : Create a binary search tree containing x minus each element in the array. Then, check whether any element of the array appears in the BST. It takes O(nlogn) time to create a binary search tree from an array, since it takes O(logn) time to insert something into a BST, and it takes O(nlogn) time to see if any element in an array is in a BST, since the lookup time for each element in the array takes O(logn). Therefore step one takes `O(nlogn)`time and step two takes `O(nlogn)` time, so our total running time is O(nlogn).
