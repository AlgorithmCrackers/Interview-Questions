#include <iostream>
#include <assert.h>

void FindMin_Naive(int &result, const int &x, const int &y)
{
  result = (x < y) ? x : y;
}

void FindMin_BitHack(int &result, const int &x, const int &y)
{
  result = y ^ ((x ^ y) & -(x < y));
}

int main()
{
  int result = 0;
  FindMin_Naive( result, 147, 274 );
  assert( result == 147 );
  result = 0;
  FindMin_BitHack( result, 147, 274 );
  assert( result == 147 );
  std::cout << "All asserts passed" << std::endl;
  return 0;
}
