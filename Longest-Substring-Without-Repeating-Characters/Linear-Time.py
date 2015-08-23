"""
http://www.programcreek.com/2013/02/leetcode-longest-substring-without-repeating-characters-java/

http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

"""

def lenLongestSubstring( stringX ):
    maxi = 0
    trackList = [] # List to store the chars that have been visited
    for char in stringX :
        if ( char not in trackList ):
            trackList.append(char)
        else: # found a repeating char
            listLen = len(trackList)
            maxi = max( maxi, listLen )
            charIdx = trackList.index(char)
            trackList.append(char)
            trackList[:charIdx+1] = [] # clears the before and at the previous occuring char
    return max( maxi, len(trackList) )


def main():
    assert lenLongestSubstring( "BBBBB" ) == 1
    assert lenLongestSubstring( "ABDEFGABEF" ) == 6
    assert lenLongestSubstring( "abcabcbb" ) == 3
    assert lenLongestSubstring( "asdfgauvwx" ) == 9
    assert lenLongestSubstring( "GEEKSFORGEEKSXYZRLBHA" ) == 11
    assert lenLongestSubstring( "HELLOTHISISSIDDHARTHJAINISISSID" ) == 7
    assert lenLongestSubstring( "abcadeftgh" ) == 9
    print "\nAll asserts PASSED!!, Yaaaaaay!!\n"

if __name__ == "__main__":
    main()
