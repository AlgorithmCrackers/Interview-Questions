# How to set, clear, toggle and check a bit ?
See the comments in `main.cpp` to understand how the routines work.

[Refer](http://stackoverflow.com/questions/47981/how-do-you-set-clear-and-toggle-a-single-bit-in-c-c) for a more detailed discussion.

## C++ STL natively supports this
```c
#include <bitset>
#include <iostream>

int main()
{
  std::bitset<5> x;

  x[1] = 1;
  x[2] = 0;
  // Note x[0-4]  valid

  std::cout << x << std::endl;
}
```
```c
[Alpha:] > ./a.out
00010
```
