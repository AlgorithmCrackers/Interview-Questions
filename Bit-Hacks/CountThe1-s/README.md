##How Does it Work

###Method 1:
Step 1:
```
1 is subtracted from the number
```

Step 2:
```
perform x AND x-1 to remove the last 1.  See the below diagram
count variable takes count of the number of 1 in the variable
```
|variable| binary value|
|-------|------|
|x| 00101101110**1**0000|
|x-1| 00101101110**01111**|
|x & (x-1)|00101101110**00000**|

Step 3:
```
output the count 
```
#### Performance
Proportinal to the number of bits in the word. Takes O(n) time in worst case if all the bits are one.

### Method 2:
#### Strategy:      
Parallel divide- and-conquer

####Steps:
![Count 1](https://cloud.githubusercontent.com/assets/3127498/5535327/2e42078c-8a4a-11e4-8d44-c73668eb3899.png)

####Performance:
Takes O(lg n) times where n is the word Length.
