/* function which returns the minimum element
@param x:Int
@param y:Int
@return Int   the mininmum of x,y
*/

func findMin(x:Int, y:Int) -> Int {
    return (y ^ ((x ^ y) & -((x < y) ?1 :0)))
}

findMin(10, 15) //tested in playground
