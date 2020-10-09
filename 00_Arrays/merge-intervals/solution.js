/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function (intervals) {
  const ans = [];
  if (intervals.length === 0) return ans;
  intervals.sort((a, b) => a[0] - b[0]);
  let min = intervals[0][0];
  let max = intervals[0][1];
  for (let i = 1; i < intervals.length; i++) {
    if (intervals[i][0] > max) {
      ans.push([min, max]);
      min = intervals[i][0];
      max = intervals[i][1];
    } else {
      min = Math.min(intervals[i][0], min);
      max = Math.max(intervals[i][1], max);
    }
  }
  ans.push([min, max]);
  return ans;
};

function test(input, output) {
  const answer = merge(input);
  const testSuccess = JSON.stringify(answer) === JSON.stringify(output);
  if (testSuccess) {
    console.log("✅ PASS: ", input, " === ", output);
  } else {
    console.log(
      "❌ FAIL - GOT: ",
      answer,
      "EXPECTED: ",
      output,
      "INPUT: ",
      input
    );
  }
}

// case 1
test(
  [
    [1, 3],
    [2, 6],
    [8, 10],
    [15, 18],
  ],
  [
    [1, 6],
    [8, 10],
    [15, 18],
  ]
);

// case 2
test(
  [
    [1, 4],
    [4, 5],
  ],
  [[1, 5]]
);

// case 3
test(
  [
    [1, 4],
    [0, 0],
  ],
  [
    [0, 0],
    [1, 4],
  ]
);
