## Is Anagram

![Easy difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

Given two strings s and t , write a function to determine if t is an anagram of s.

> An anagram is a result of rearranging the letters of a word to produce a new word.

## Example 1:

```
Input: s = "anagram", t = "nagaram"
Output: true
```

## Example 2:

```
Input: s = "rat", t = "car"
Output: false
```

### Note:

You may assume the string contains only lowercase alphabets.

### Follow up:

What if the inputs contain unicode characters? How would you adapt your solution to such case?

## Solution (only lowercase alphabets -- Array)

- use an array of size 26, to count the frequency of each alphabet
- sweep through first string and increment the count for each alphabet
- sweep through second string and decrement the count for each alphabet
- check the counter array, if every value in the array is 0, then the strings are an anagram

## Complexity Analysis (only lowercase alphabets -- Array):

- **Time complexity** : `O(len(string))`. We have to sweep through the entire string.

- **Space complexity** : `O(1)`. The size of the counter array is always 26. Does not scale with the size of the string.

## Solution (when its unicode characters -- Hashmap)

- Count the frequency of each character in first string. ( use hashmap ) `O(n)`
- For Second string, check if each character in the string `O(n)` exists in the hashmap `O(1)`
  - If yes, `O(1)`
    - If count is already 0. Then its not an anagram.
    - Else, decrement the count by 1
  - If no, Then its not an anagram. `O(n)`

## Complexity Analysis (when its unicode characters -- Hashmap):

- **Time complexity** : `O(len(string))`. We have to sweep through the entire string.

- **Space complexity** : `O(len(string))`. The size of the hashmap, to fit in all the unicode characters present it. in worst case, when every character is unique, the space becomes `len(string)`

#### [LeetCode link](https://leetcode.com/problems/valid-anagram/)
