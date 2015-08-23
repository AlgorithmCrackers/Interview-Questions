#include <iostream>
#include <assert.h>

int modAdd_Naive(const int &x, const int &y, const int &n)
{
  return ( (x + y) % n ); // Divide is expensive, unless by a power of 2.
}

int modAdd_Optimal(const int &x, const int &y, const int &n)
{
  int z = x + y;
  return ( (z < n) ? z : (z-n) ); // Unpredictable branch is expensive
}

int modAdd_BitHack(const int &x, const int &y, const int &n)
{
  int z = x + y;
  return ( z - (n & -(z >= n)) ); //  same trick as minimum
}

int main()
{
  int a = 147, b = 45, n = 7000;
  assert( modAdd_Naive( a, b, n ) == modAdd_Optimal( a, b, n ) );
  int A = 432, B = 2000, N = 100000;
  assert( modAdd_Naive( A, B, N ) == modAdd_Optimal( A, B, N ) );
  std::cout << "All asserts passed" << std::endl;
  return 0;
}
