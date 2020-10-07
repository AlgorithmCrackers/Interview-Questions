# Product of Array Except Self

![Medium difficulty](https://img.shields.io/badge/difficulty-medium-yellow)

Given an array nums of `n` integers where `n > 1`,  return an array output such that `output[i]` is equal to the product of all the elements of nums except nums[i].

## Example:

```
Input:  [1,2,3,4]
Output: [24,12,8,6]
```

**Constraint:** It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

**Note:** Please solve it without division and in O(n).

### Follow up:

Could you solve it with constant space complexity? (*The output array does not count as extra space for the purpose of space complexity analysis.*)


## Complexity Analysis (L & R array + answer array solution):

- **Time complexity** : `O(n)`. *n* represents the number of elements in the input array. We use one iteration to construct the array L, one to construct the array R and one last to construct the answer array using L and R.

- **Space complexity** : `O(n)`. O(n) used up by the two intermediate arrays that we constructed to keep track of product of elements to the left and right.

## Complexity Analysis (answer array only solution):

- **Time complexity** : `O(n)`. *n* represents the number of elements in the input array. We use one iteration to initialise the answer array with left side products, and one more iteration to update the answer array with the right side product multiplication.

- **Space complexity** : `O(1)`. since don't use any additional array for our computations. The problem statement mentions that using the answer array doesn't add to the space complexity.

### [Leetcode Problem](https://leetcode.com/problems/product-of-array-except-self)
