#include <iostream>
#include <assert.h>

int modAdd_Naive(const int &x, const int &y, const int &n)
{
  return ( (x + y) % n ); // Divide is expensive, unless by a power of 2.
}

int modAdd_Optimal(int &result, const int &x, const int &y, const int &n)
{
  int z = x + y;
  return ( (z < n) ? z : z-n ); // Unpredictable branch is expensive
}

int modAdd_BitHack(int &result, const int &x, const int &y)
{
  int z = x + y;
  return ( z - (n & -(z >= n)) ); //  same trick as minimum
}

int main()
{
  assert( modAdd_Naive( 147, 7000, 45 ) == modAdd_BitHack( 147, 7000, 45 ) );
  assert( modAdd_Naive( 100000, 2000, 4328435678342 ) == modAdd_BitHack( 100000, 2000, 4328435678342 ) );
  std::cout << "All asserts passed" << std::endl;
  return 0;
}
