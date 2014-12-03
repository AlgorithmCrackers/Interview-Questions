# Compute (x + y) mod n, assuming that 0 ≤ x < n and 0 ≤ y < n.

## Naive
**Divide is expensive, unless by a power of 2.**
```c
result =  (x + y) % n;
```
## Optimal
**Unpredictable branch is expensive**
```c
z = x + y;
result = (z < n) ? z : z-n;
```
## With Bithack
```c
z = x + y;
result = ( z - (n & -(z >= n)) );
```
**Same trick as the `Minimum of 2 integers`**
## How does it work ?

When `z >= n == 1`,
```c
then −(z >= n) = −1; // 11111111 ( 2's complement representation )
so result = z - ( n & 11111111 )
=> result = z - n
```
When `z >= n == 0`,
```c
then −(z >= n) = −0; // 00000000
so result = z - ( n & 0 )
=> minimum = y ^ 0
=> result = z
```
