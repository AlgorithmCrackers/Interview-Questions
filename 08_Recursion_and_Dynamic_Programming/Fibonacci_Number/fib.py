def getFib(n):
	if n < 2:
		return n
	first = 0
	second = 1
	third = 0
	for i in range( 2, n + 1):
		third = first + second
		first = second
		second = third
	return second

if __name__ == '__main__':
	print "the number is {0}".format(getFib(6))