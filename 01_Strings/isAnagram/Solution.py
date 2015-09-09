def isAnagram(str1, str2):
	char_dict = {}
	# if length is not same then NOT an anagram
	if len(str1) != len(str2):
		return False
	for i in range(len(str1)):
		if not str1[i] in char_dict: #if the char is not already in dict
			char_dict[str1[i]] = 1
		else: # increase the count when ever we see another entry of the same character
			char_dict[str1[i]] += 1
	#loop through the second string
	for i in range(len(str2)):
		if not str2[i] in char_dict:
			return False
		else:
			if char_dict[str2[i]] == 0:
				return False
			else:
				char_dict[str2[i]] -= 1
				if char_dict[str2[i]] == 0:
					del char_dict[str2[i]]
	return True

def main():
	print "running isAnagram"
	assert isAnagram("anagram","ngarama") == True
	assert isAnagram("anagram","nagaram") == True
	assert isAnagram("aaaaa","a") == False
	assert isAnagram("a","aaaaa") == False
	assert isAnagram("level","leael") == False
	assert isAnagram("level","level") == True
	print 'All is well :)'

if __name__ == '__main__':
	main()