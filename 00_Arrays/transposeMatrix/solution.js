var transpose = function(A) {
  const H = A.length
  const W = A[0] ? A[0].length : 0
  // A => H x W
  // Result => W x H (initially filled with 0's)
  const result = Array(W).fill(0).map(x=>Array(H).fill(0));
  for (let c = 0; c < W; c++) {
      for (let r = 0; r < H; r++) {
        // flip columns and rows
         result[c][r] = A[r][c]
      }
  }
  return result
};