/* 
Compute (x+y)mod n
Assumption x,y < n

@param x:Int
@param y:Int
@param n:Int  Modulus number
@return Int   Modulus of the sum of x,y
*/

func modAddition( x:Int, y:Int, n:Int) -> Int {
  var z = x + y
  return (z - (n & -((z >= n) ?1 :0)))
}

modAddition(5, 4, 6)  //result 9 % 6 = 3 
