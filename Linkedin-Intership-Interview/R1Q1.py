"""
similar problem : http://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/

"""
def distance( arrayOfStrings, stringX, stringY  ): # O(n^2)
    n = len(arrayOfStrings)
    minDist = n # initialise the min distance as the max possible value
    for i in range(0, n):
        if(  stringX == arrayOfStrings[i]  or stringY == arrayOfStrings[i] ):
            for j in range(i, n):
                equalityTest1 = ( stringX == arrayOfStrings[i] and stringY == arrayOfStrings[j] )
                equalityTest2 = ( stringY == arrayOfStrings[i] and stringX == arrayOfStrings[j] )
                if ( ( equalityTest1 or equalityTest2) and  ( minDist > abs(i-j) ) ):
                    minDist = abs(i-j)
    return minDist

def distanceFast( arrayOfStrings, stringX, stringY ): # O(n)
    n = len(arrayOfStrings)
    minDist = n # initialise the min distance as the max possible value
    prevI = 0
    i = 0
    while (i < n): # store the 1st occurrence  
        if(  stringX == arrayOfStrings[i]  or stringY == arrayOfStrings[i] ):
            prevI = i 
            break
        i += 1

    while (i < n):
        if(  stringX == arrayOfStrings[i]  or stringY == arrayOfStrings[i] ): # check if any string occurs
            if ( ( arrayOfStrings[prevI] != arrayOfStrings[i] ) and minDist > (i-prevI) ): 
            # update min-distance if the previous string is not the same and if the previous min distance stored needs to be updated
                minDist = (i-prevI)
                prevI = i
            else:
                prevI = i
        i += 1
    
    return minDist

def main():
    array = ["the", "quick", "brown", "fox", "quick"]
    assert distance(array, "fox", "the") == 3
    assert distance(array, "quick", "fox") == 1
    assert distanceFast(array, "fox", "the") == 3
    assert distanceFast(array, "quick", "fox") == 1
    print "\nAll asserts PASSED!!, Yaaaaaay!!\n"

if __name__ == "__main__":
    main()