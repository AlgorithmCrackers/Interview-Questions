```c
minimum = y ^ ((x ^ y) & -(x < y));
```

## How does it work ?

When `x < y == 1`,
```c
then −(x < y) = −1; // 11111111 ( 2's complement representation )
so minimum = y ^ ( (x ^ y) & 11111111 )
=> minimum = y ^ ( x ^ y )
=> minimum = x
```
When `x < y == 0`,
```c
then −(x < y) = −0; // 00000000
so minimum = y ^ ( (x ^ y) & 0 )
=> minimum = y ^ 0
=> minimum = y
```
## Performance without Bit-Hack
```c
minimum = (x < y) ? x : y;
```
A mispredicted branch empties the processor pipeline

  * ~16 cycles on Intel Core i7’s.

The compiler might be smart enough to avoid the
unpredictable branch, but maybe not.
