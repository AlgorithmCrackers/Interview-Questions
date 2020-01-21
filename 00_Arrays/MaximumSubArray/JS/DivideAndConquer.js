// Find the maximum possible sum in nums[] auch that nums[mid] is part of it
function maxCrossingSum(nums, left, mid, right) {
  let leftMaxCrossingMid = Number.MIN_SAFE_INTEGER
  let sum = 0
  // Include elements on left of mid. (including nums[mid] itself, since we start from nums[mid] it is always included)
  // at the very least will contain nums[mid].. when all are positive it will have nums[mid] to nums[left]
  for (let i=mid; i >= left; i--) {
      sum = sum + nums[i]
      leftMaxCrossingMid = Math.max(sum, leftMaxCrossingMid)
  }
  let rightMaxCrossingMid = Number.MIN_SAFE_INTEGER
  sum = 0
  // Include elements on right of mid. (starts from nums[mid + 1] itself, since we start from nums[mid + 1] it is always included)
  // at the very least will contain nums[mid + 1].. when all are positive it will have nums[mid + 1] to nums[right]
  for (let i=(mid + 1); i <= right; i++) {
      sum = sum + nums[i]
      rightMaxCrossingMid = Math.max(sum, rightMaxCrossingMid)
  }
  return leftMaxCrossingMid + rightMaxCrossingMid
}

function maxSubArrayHelper(nums, left, right) {
  // base case, only one element
  if (left === right) {
      return nums[left]
  }

  const mid = Math.trunc(left + (right - left) / 2)

  // Maximum subarray sum in left half
  const leftMax = maxSubArrayHelper(nums, left, mid)
  // Maximum subarray sum in right half
  const rightMax = maxSubArrayHelper(nums, mid + 1, right)
  // Maximum subarray sum such that the subarray crosses the midpoint
  const maxCrossingMid = maxCrossingSum(nums, left, mid, right)

  /* Return maximum of following three possible cases
    a) Maximum subarray sum in left half
    b) Maximum subarray sum in right half
    c) Maximum subarray sum such that the subarray crosses the midpoint
  */
  return Math.max(leftMax, rightMax, maxCrossingMid)
}

var maxSubArray = function(nums) {
  return maxSubArrayHelper(nums, 0, nums.length - 1)
};