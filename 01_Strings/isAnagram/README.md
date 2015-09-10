## Is Anagram
```
Determine if 2 Strings are anagrams

time complexity: O(len(string))
space complexity: O(len(string))
```
> An anagram is a result of rearranging the letters of a word to produce a new word.

## Solution

* Count the frequency of each character in first string. ( use hashmap ) `O(n)`
* For Second string, check if each character  in the string `O(n)` exists in the hashmap `O(1)`
  * If yes, `O(1)`
    * If count is already 0. Then its not an anagram.
    * Else, decrement the count by 1
  * If no, Then its not an anagram. `O(n)`
