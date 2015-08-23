import Cocoa

/* calculate the next power of 2 for the number (if it is of 32 bits
@param n:Int
@return Int next power of 2
*/

func nextPowerOf2(var n:Int32) -> Int32 { //O(lg n)
    --n    //cornor cases of power of 2
    n = n | n >> 1
    n = n | n >> 2
    n = n | n >> 4
    n = n | n >> 8
    n = n | n >> 16
    ++n
    return n
}

nextPowerOf2(16)

func nextPowerof2_shiftingMethod(var n:Int) -> Int {    //O(lg n)
    //base case
    if((n != 1) && (n & (n-1) == 0)) { //Any power of 2 minus 1 is all ones so the bitwise & result in 0 if power of 2
        return n
    }
    var count = 0;
    while n != 0 {
        count++
        n = n >> 1
    }
    return (1 << count)
}

nextPowerof2_shiftingMethod(12345)