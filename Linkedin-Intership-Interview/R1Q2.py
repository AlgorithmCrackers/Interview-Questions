# give two sorted array of strings, get a merged sorted array combining the two

def merge( array1, array2 ):
    m = len(array1)
    n = len(array2)
    i = 0
    j = 0
    resultArray = []
    while ( (i<m) and (j<n) ):
        if (array1[i] < array2[j]):
            resultArray.append( array1[i] )
            i += 1
        else:
            resultArray.append( array2[j] )
            j += 1

    if ( i < m ):
        resultArray.extend( array1[i:] )
    elif( j < n):
        resultArray.extend( array2[j:] )

    return resultArray

def merge2( array1, array2 ): # not needed!
    m = len(array1)  
    k = 0
    i = 0 # start
    j = m # start of array2
    resultArray = array1 + array2
    n = len( resultArray ) 
    while ( (i<m) and (j<n) ):
        if ( resultArray[j] < array1[i] ):
            resultArray[k] = resultArray[j]
            j += 1; k += 1
        else:
            resultArray[k] = array1[i]
            i += 1; k += 1

    while ( i < m ):
        resultArray[k] = array1[i]
        i += 1; k += 1
        
    return resultArray

def main():
    array1 = ["good", "person"] 
    array2 = ["he", "is"]
    assert merge(array1, array2) == ["good", "he", "is", "person"]
    print "\nAll asserts PASSED!!, Yaaaaaay!!\n"

if __name__ == "__main__":
    main()