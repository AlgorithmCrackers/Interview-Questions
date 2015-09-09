
def letterInOrder(str):
	l = len(str)
	if l == 0 or l == 1:
		return True
	#container for holding the current max
	max = 0
	for i in range(l):
		if max > ord(str[i]):
			return False
		else:
			max = ord(str[i])
	return True



def main():
	assert letterInOrder('almost') == True
	assert letterInOrder('cereal') == False
	print "all is well :)"

if __name__ == "__main__":
	main()