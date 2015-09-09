#include <iostream>
#include <assert.h>

void setBit(int &number, const int &i)
{
  number |= 1U << i;
}

void clearBit(int &number, const int &i)
{
  number &= ~( 1U << i );
}

void toggleBit(int &number, const int &i)
{
  number ^= 1U << i;
}

void checkBit(int &number, const int &i, int &bit)
{
  bit = (number >> i) & 1U;
}

int main()
{
  int num = 131; // 10000011
  setBit( num, 4 ); // 10000011 | 00010000 = 10010011
  assert( num == 147); // 10010011 = 147
  // num is now 147
  clearBit( num, 4); // 10010011 & 11101111 = 10000011
  assert( num == 131 ); // 10000011 = 131
  // num is now 131
  toggleBit( num, 1 ); // 10000011 ^ 00000010 = 10000001
  assert( num == 129 ); // 10000001 = 129
  int bit = 0;
  checkBit( num, 7, bit); // (10000001 >> 7) & 1 = 00000001 & 000000001
  assert( bit == 1); // 000000001 = 1
  std::cout << "All asserts passed" << std::endl;
  return 0;
}
