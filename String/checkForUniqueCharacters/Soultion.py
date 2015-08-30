
def isUnique(str):
	char_set = set() #set to strore all the characters
	if(len(str) == 1 or len(str) == 0):
		return True
	for i in range(len(str)):
		if str[i] in char_set:	#if the char is already in set not unique
			return False
		else:
			char_set.add(str[i])	#add the element into the set
	return True


def main():
	print "checking for unique charaters in string"
	assert isUnique("asdf") == True
	assert isUnique("ass") == False
	assert isUnique('') == True
	assert isUnique('asdfghjklqwertyuiop;') == True
	print "all is well :)"

if __name__ == '__main__':
	main()