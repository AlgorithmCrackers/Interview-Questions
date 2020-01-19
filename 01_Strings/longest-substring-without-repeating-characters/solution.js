/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring_Map = function(s) {
  let maxCount = 0
  let left = 0
  // chars in the strings to their latest indexes
  const map = new Map()

  for (let right = 0; right < s.length; right++) {
      if (map.has(s[right])) {
          const duplicate_index = map.get(s[right])
          // use max here to ensure that left doesnt go back
          left = Math.max(left, duplicate_index + 1)
      }
      // if there was a duplicate, the index is updated thats it
      map.set(s[right], right)
      // always calculate the max count
      const count = right - left + 1
      maxCount = Math.max(count, maxCount)
  }
  return maxCount
};

var lengthOfLongestSubstring_Set = function(s) {
  let maxCount = 0
  // set comprising unique characters in the window
  const set = new Set()
  const N = s.length
  let left = 0
  let right = 0
  while (right < N) {
      if (set.has(s[right])) {
          // keep on deleting items on the set based on the left window index, until we find the substring start where there is no repeating character
          set.delete(s[left])
          left++
      } else {
          // the character is unique, add to substring found
          set.add(s[right])
          // get the current substring size and compare to max
          maxCount = Math.max(maxCount, set.size)
          // increment right window
          right++
      }
  }
  return maxCount
};