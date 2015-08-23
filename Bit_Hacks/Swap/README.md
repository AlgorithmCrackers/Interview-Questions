## How does it work ?
For example, let,
```c
x = 10111101;
y = 00101110;
```
Step 1,
```c
x = x ^ y;

x == 10010011; <= changed
y == 00101110;
```
Step 2,
```c
y = x ^ y;

x == 10010011;
y == 10111101; <= changed
```
Step 3,
```c
x = x ^ y;

x == 00101110; <= changed
y == 10111101;
```
## Why does it work ?
XOR is its own inverse:
```c
(x ^ y) ^ y = x;
(x ^ y) ^ x = y;
```
## Performance
Poor at exploiting instruction-level parallelism (ILP).
