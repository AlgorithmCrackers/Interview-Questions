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

def isAnagram_2(s, t):
    """
    :type s: str
    :type t: str
    :rtype: bool
    """
    sLen = len(s)
    tLen = len(t)
    if sLen != tLen:
        return False
    # initialise count array with 0
    char_count = [0] * 26
    for i in range(sLen):
        # check for diff from char 'a' and save it
        char_count[ord(s[i]) - ord('a')] += 1
    for j in range(tLen):
        # remove the entry in char array as the character appears
        char_count[ord(t[j]) - ord('a')] -= 1
    for k in range(sLen):
        if char_count[k] != 0:
            # if any of the entry is not zero then there is some mismatch 
            return False
    return True

# O(nlog n) for sorting(which is internal)
# O(1) space

def isAnagram_3(s, t):
    sLen = len(s)
    tLen = len(t)
    if sLen != tLen:
        return False
    # sort bothe strings and see if all the elements are equal
    s = sorted(s)
    t = sorted(t)
    for i in range(sLen):
        if s[i] != t[i]:
            return False
    return True

# O(n * n) time, O(1) space
def isAnagram_4(s, t):
    """
    :type s: str
    :type t: str
    :rtype: bool
    """
    while s != '':
        if len(s) != len(t):
            return False
        tmp = s[0]
        # replace the char in first array
        s = s.replace(tmp, '')
        try:
            # replace the char in second array
            t = t.replace(tmp, '')
        except:
            # exception occurs if there is not element
            return False

    if t != '':
        # if second array still has entries then chars does not match
        return False
    else:
        return True

def main():
	print "running isAnagram"
	assert isAnagram("anagram","ngarama") == True
	assert isAnagram_2("anagram","nagaram") == True
	assert isAnagram_3("aaaaa","a") == False
	assert isAnagram_4("a","aaaaa") == False
	assert isAnagram_2("level","leael") == False
	assert isAnagram_4("level","level") == True
	print 'All is well :)'

if __name__ == '__main__':
	main()