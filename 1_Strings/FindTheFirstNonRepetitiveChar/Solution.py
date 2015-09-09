def first_char(str):
	char_dict = {}
	for i in range(len(str)):
		if str[i] in char_dict:
			char_dict[str[i]] += 1
		else:
			char_dict[str[i]] = 1
	for i in range(len(str)):
		if char_dict[str[i]] == 1: #found the char with 1 occurance
			return str[i]
	return ''

# function to test expected and actual output
def test(got, expected):
  if got == expected:
    prefix = ' OK '
  else:
    prefix = '  X '
  print '%s got: %s expected: %s' % (prefix, repr(got), repr(expected))

# starting function
def main():
	print 'testing first non repetitive character'
	assert first_char('abcab') == 'c'
	assert first_char('aaaaaa') == ''
	assert first_char('asdfghjklasdfghjsdfhjkgshaj') == 'l'
	print 'All is well :)'

if __name__ == '__main__':
	main()