# Longest Substring Without Repeating Characters

![Medium difficulty](https://img.shields.io/badge/difficulty-medium-yellow)

Given a string, find the length of the longest substring without repeating characters.

## Example 1:

```
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

## Example 2:

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

## Example 3:

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Complexity Analysis (HashMap approach):

- **Time complexity** : `O(n)`. We sweep through the list once

- **Space complexity** : `O(n)`. The size of the hashmap can be all the elements in the whole array if they are unique

## Complexity Analysis (HashSet approach):

- **Time complexity** : **`O(2n) = O(n)`**. In the worst case each character will be visited twice by `left_pointer` and `right_pointer`.

- **Space complexity** : `O(n)`. The size of the hashset can be all the elements in the whole array if they are unique

#### [LeetCode link](https://leetcode.com/problems/longest-substring-without-repeating-characters)
#### [LeetCode discussion](https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729/11-line-simple-Java-solution-O(n)-with-explanation)