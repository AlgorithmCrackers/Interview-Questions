/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    const H = matrix.length
    const W = matrix[0] ? matrix[0].length : 0
    
    // find if the first row needs to be filled with zeros
    let first_row_zero = false
    if (H > 0) {
        for (let c = 0; c < W; c++) {
            if (matrix[0][c] === 0) {
                first_row_zero = true
            }
        }
    }
    
    // use first row as a flag to denote if columns need to be filled with zeros
    // start with r as 1 because for first row we dont need to see if column needs to be filled we would have it already
    for (let r = 1; r < H; r++) {
        for (let c = 0; c < W; c++) {
            if (matrix[r][c] === 0) {
                matrix[0][c] = 0 // fill the flag to denote that the column should be filled with zeroes 
            }
        }
    }
    
    // find which cells need to be zeroed
    // first row is a flag, so neglect it and start from next
    for (let r = 1; r < H; r++) {
        // flag to see if the whole row needs to be zeroed
        let row_contains_zero = false
        for (let c = 0; c < W; c++) {
            if (matrix[r][c] === 0) {
                row_contains_zero = true
            }
        }
        // use the first row flag to see if column needs to be filled
        // use the row_contains_zero boolean variable to see if row needs to be filled with zeroes
        for (let c = 0; c < W; c++) {
            if (row_contains_zero || matrix[0][c] === 0) {
                matrix[r][c] = 0
            }
        }
    }
    
    // now see if first row needs to be filled with zeroes
    if (first_row_zero) {
        for (let c = 0; c < W; c++) {
            matrix[0][c] = 0
        }
    }
    
};
