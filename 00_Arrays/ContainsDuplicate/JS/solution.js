/**
 * @param {number[]} nums
 * @return {boolean}
 */

// O(n log n) (sorting)
var containsDuplicateSort = function(nums) {
  // modifying the original array, we could also have made a copy
  nums.sort((a, b) => a - b)
  // check if an array elements are equal next to each other
  // note that the limit is nums.length - 1
  for (let i=1; i < nums.length - 1; i++) {
      if (nums[i] === nums[i - 1]) return true
  }
  return false
};

// O(n) (hash-set)
var containsDuplicate = function(nums) {
  const set = new Set()
  // add to set if it is not present already
  // if it was present we have found a duplicate
  for (let i=0; i < nums.length; i++) {
      if (set.has(nums[i])) return true
      set.add(nums[i])
  }
  return false
};
