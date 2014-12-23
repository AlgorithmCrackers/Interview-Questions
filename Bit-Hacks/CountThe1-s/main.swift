/*COUNT the number of 1's in the number */
/*
@param n:Int value whose 1's has to be counted 
@return Int number of 1's in the n
*/

//Method 1:
func count1(var n:Int) -> Int { //var is added to make it a variable from constant(let)
    var b:Int
    for b = 0; n != 0; ++b {
        n = n & (n-1)
    }
    return b
}
count1(7)  //3

//Method 2
func count1DivideAndConquer(var x:Int) -> Int {
    var B5 = ~((-1) << 32)  //mask of all 32 bits
    var B4 = B5 ^ (B5 << 16);
    var B3 = B4 ^ (B4 << 8);
    var B2 = B3 ^ (B3 << 4);
    var B1 = B2 ^ (B2 << 2);
    var B0 = B1 ^ (B1 << 1);
    x = ((x >> 1) & B0) + (x & B0);
    x = ((x >> 2) & B1) + (x & B1); x = ((x >> 4) + x) & B2;
    x = ((x >> 8) + x) & B3;
    x = ((x >> 16) + x) & B4;
    x = ((x >> 32) + x) & B5;
    return x
}

count1DivideAndConquer(7) //3
