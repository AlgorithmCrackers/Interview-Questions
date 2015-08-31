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

def shortestPalindrome(str):
	for i in range(len(str)):
		temp = str + str[0:i][::-1]	# [::-1] is to reverse the string
		if isPalindrome(temp):
			return temp


def main():
	print 'testing Palindrome'
	assert shortestPalindrome('aaab') == 'aaabaaa'
	print 'all is well :)'
if __name__ == '__main__':
	main()