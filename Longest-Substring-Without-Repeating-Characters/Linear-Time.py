"""
http://www.programcreek.com/2013/02/leetcode-longest-substring-without-repeating-characters-java/

http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

"""

def lenLongestSubstring( stringX ):
    maxi = 0
    trackDict = {} # dict to store the chars that have been visited  
    for char in stringX :
        # NOTE: trackDict.get( , None) return None when key is not present
        if (  trackDict.get(char, None) == 1 ): # check if the char has already been visited
            listLen = len(trackDict)
            maxi = max( maxi, listLen )
            trackDict.clear()
        trackDict[char] = 1 # adds the current char as visited

    return max( maxi, len(trackDict) )


def main():
    assert lenLongestSubstring( "BBBBB" ) == 1
    assert lenLongestSubstring( "ABDEFGABEF" ) == 6
    assert lenLongestSubstring( "abcabcbb" ) == 3
    assert lenLongestSubstring( "asdfgauvwx" ) == 5
    assert lenLongestSubstring( "GEEKSFORGEEKSXYZRLBHA" ) == 11
    assert lenLongestSubstring( "HELLOTHISISSIDDHARTHJAINISISSID" ) == 6
    print "\nAll asserts PASSED!!, Yaaaaaay!!\n"

if __name__ == "__main__":
    main()