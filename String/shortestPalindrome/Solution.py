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
	if len(str) == 0 or len(str) == 1:
		return str
	for i in range(len(str)):
		temp = str + str[0:i][::-1]	# [::-1] is to reverse the string
		if isPalindrome(temp):
			return temp


def main():
	print 'testing Palindrome'
	assert shortestPalindrome('aaab') == 'aaabaaa'
	assert shortestPalindrome('a') == 'a'
	assert shortestPalindrome('aa') == 'aa'
	assert shortestPalindrome('tim') == 'timit'
	assert shortestPalindrome('') == ''
	print 'all is well :)'
if __name__ == '__main__':
	main()