# Python

* What is the value of `ans` in the following code? - **[1,1]** - [Blog](http://effbot.org/zone/default-values.htm)
``` python
>>> def function(data=[]):
...     data.append(1)
...     return data
...
>>> function()
[1]
>>> ans = function()
```
