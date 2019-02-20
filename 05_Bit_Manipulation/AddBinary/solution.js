/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    // http://web.math.princeton.edu/math_alive/Crypto/Lab1/BinAddEx2.html
    // http://www.binarymath.info/binary-addition.php
    /*
    0 + 0 = 0
    0 + 1 = 1
    1 + 0 = 1
    1 + 1 = 10 
    1 + 1 + 1 = 10 + 1 = 11 
    */
    let ans = ""
    let aIndex = a.length - 1
    let bIndex = b.length - 1
    let carry = null
    while(aIndex >= 0 || bIndex >= 0 || carry !== null) {
        let ansThisLoop = 0
        if (aIndex >= 0) {
            ansThisLoop = a.charAt(aIndex) - '0'
        }
        if (bIndex >= 0) {
            ansThisLoop = ansThisLoop + (b.charAt(bIndex) - '0')
        }
        if (carry !== null) {
            ansThisLoop = ansThisLoop + carry
        }
        // the binary conversion happens here
        if (ansThisLoop === 2) {
            carry = 1
            ansThisLoop = 0
        } else if (ansThisLoop === 3) {
            carry = 1
            ansThisLoop = 1
        } else {
            carry = null
        }
        ans = '' + ansThisLoop + ans
        aIndex--
        bIndex--
    }
    return ans
};
