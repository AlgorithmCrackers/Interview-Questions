/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
  // borrowing the same idea from kadane's algorithm for max contigous subarray sum
  let maxProd = null
  // we have two variables which keep track of subarray sum (max or min) which includes the previous element
  let prevSubArrayMaxProd = null
  // we keep track of minimum as well, because when multiplying with negative numbers multpying with min will give the maximum
  let prevSubArrayMinProd = null
  nums.forEach(num => {
      const currSubArrayMaxProd = prevSubArrayMaxProd !== null && prevSubArrayMinProd !== null ? Math.max(num, prevSubArrayMaxProd * num, prevSubArrayMinProd * num) : num
      const currSubArrayMinProd = prevSubArrayMaxProd !== null && prevSubArrayMinProd !== null ? Math.min(num, prevSubArrayMaxProd * num, prevSubArrayMinProd * num) : num
      // the max containing this element is a candiate for our global max
      maxProd = maxProd !== null ? Math.max(maxProd, currSubArrayMaxProd) : currSubArrayMaxProd
      prevSubArrayMaxProd = currSubArrayMaxProd
      prevSubArrayMinProd = currSubArrayMinProd
  })
  return maxProd
};