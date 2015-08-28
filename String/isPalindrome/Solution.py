
def isPalindrome(str):
	l = len(str)
	if l == 0 or l == 1:
		return True
	mid = l / 2
	high = l - 1
	low = 0
	for i in range(mid):
		if str[low] != str[high]:
			return False
		high -= 1
		low += 1
	return True

def main():
	print "checking for Palindrome"
	assert isPalindrome("level") == True
	assert isPalindrome('malayalam') == True
	assert isPalindrome('abcs') == False
	assert isPalindrome('a') == True
	print 'all is well :)'

if __name__ == '__main__':
	main()