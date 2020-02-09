/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */

/*
  layer 0, start
  A .... B
  ........
  ........
  ........
  D .... C

  layer 1, start
  .........
  ..A...B..
  .........
  ..D...C..
  .........

  on each iteration inside a layer
    * A moves right
    * B moves down
    * C moves left
    * D moves up
*/

var rotate = function(matrix) {
  // last_index_of_level (row or column)
  let last = matrix.length - 1
  for (let layer = 0; layer < matrix.length / 2; layer++) {
      for(let i=layer; i < last; i++) {
          // swap A -> B
          // swap matrix[layer][i] and matrix[i][last]
          let t = matrix[layer][i]
          matrix[layer][i] = matrix[i][last]
          matrix[i][last] = t
          // swap A -> C
          // swap matrix[layer][i] and matrix[last][last - 0,1..]
          t = matrix[layer][i]
          matrix[layer][i] = matrix[last][last - (i - layer)]
          matrix[last][last - (i - layer)] = t
          // swap A -> D
          // swap matrix[layer][i] and matrix[last - 0,1..][layer]
          t = matrix[layer][i]
          matrix[layer][i] = matrix[last - (i - layer)][layer]
          matrix[last - (i - layer)][layer] = t
      }
      // for every level increase, the last index goes down by one
      last--
  }
};
