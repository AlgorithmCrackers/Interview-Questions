/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
  const L = [];
  const R = [];

  // L[i] contains the product of all the elements to the left
  // Note: for the element at index '0', there are no elements to the left,
  // so L[0] would be 1
  L[0] = 1;
  for (let i = 1; i < nums.length; i++) {
    // L[i - 1] already contains the product of elements to the left of 'i - 1'
    // Simply multiplying it with nums[i - 1] would give the product of all
    // elements to the left of index 'i'
    L[i] = nums[i - 1] * L[i - 1];
  }

  // R[i] contains the product of all the elements to the right
  // Note: for the element at index 'length - 1', there are no elements to the right,
  // so R[length - 1] would be 1
  R[nums.length - 1] = 1;
  // go reverse, start from one element before the last one
  for (let i = nums.length - 2; i >= 0; i--) {
    // R[i + 1] already contains the product of elements to the right of 'i + 1'
    // Simply multiplying it with nums[i + 1] would give the product of all
    // elements to the right of index 'i'
    R[i] = nums[i + 1] * R[i + 1];
  }

  return nums.map((_, index) => L[index] * R[index]);
};

// O(1) space solution (output array does not count to space complexity)
var productExceptSelf2 = function (nums) {
  const ans = [];

  // initialise with left
  ans[0] = 1;
  for (let i = 1; i < nums.length; i++) {
    ans[i] = nums[i - 1] * ans[i - 1];
  }

  // R contains the product of all the elements to the right
  // Note: for the element at index 'length - 1', there are no elements to the right,
  // so the R would be 1
  let R = 1;
  // go reverse, start from one element before the last one
  for (let i = nums.length - 1; i >= 0; i--) {
    const left = ans[i];
    ans[i] = left * R
    R = R * nums[i]
  }

  return ans;
};

function test(input, output) {
  const answer = productExceptSelf2(input);
  const testSuccess = JSON.stringify(answer) === JSON.stringify(output);
  if (testSuccess) {
    console.log("PASS: ", input, " === ", output);
  } else {
    console.log("FAIL - GOT: ", answer, "EXPECTED: ", output);
  }
}

test([1, 2, 3, 4], [24, 12, 8, 6]);
