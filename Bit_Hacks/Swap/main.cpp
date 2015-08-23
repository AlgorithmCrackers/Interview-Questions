#include <iostream>
#include <assert.h>

const int A = 10;
const int B = 11;

void swap(int &x, int &y)
{
  x = x ^ y;
  y = x ^ y;
  x = x ^ y;
}

int main()
{
  int a = A;
  int b = B;
  swap(a, b);
  assert(a == B);
  assert(b == A);
  std::cout << "All asserts passed" << std::endl;
  return 0;
}
