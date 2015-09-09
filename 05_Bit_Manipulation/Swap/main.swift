/* Swap with out using temp inPlace
@param x:Int
@param y:Int
@return none
*/

func swap(inout x:Int, inout y:Int) {
    x = x ^ y
    y = y ^ x
    x = x ^ y
}

//testing in playground
var a = 10
var b = 11
swap(&a, &b)
a
b
