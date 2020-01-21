/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
  // global maximum seen so far
  let maxSum = Number.MIN_SAFE_INTEGER
  // best max ending at previous array element (this is our subproblem)
  let prevSubArrayMaxSum = Number.MIN_SAFE_INTEGER
  nums.forEach(num => {
      /*
        We want to answer the question:
        "What is the Max Contiguous Subarray Sum we can achieve ending at index i?"

        We have 2 choices:

        prevSubArrayMaxSum + nums[i] (extend the previous subarray best whatever it was)
          1.) Let the item we are sitting at contribute to this best max we achieved
          ending at index i - 1.

          2.) Just take the item we are sitting at's value.

        The max of these 2 choices will be the best answer to the Max Contiguous SubArraySum ending at i index
      */
      const currSubArrayMaxSum = Math.max(num, prevSubArrayMaxSum + num)
      maxSum = Math.max(maxSum, currSubArrayMaxSum)
      prevSubArrayMaxSum = currSubArrayMaxSum
  })
  return maxSum
};