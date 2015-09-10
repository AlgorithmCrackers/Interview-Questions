import math 

class Solution(object):

    # Time complexity O(2 ^ n)
    def getPermutation(self, n, k):
        char_list = map(str, range(1, n + 1)) #convert to strin
        used = [False] * len(char_list)
        result = []
        kthArray = self._getPermutation_helper(result, char_list, used, [], k)
        print "kth array is"
        print kthArray #kthArray is always None
        return kthArray

    def _getPermutation_helper(self, result, char_list, used, cur,  k):
        if len(char_list) == len(cur):
            result.append(cur + [])
            print len(result)
            print cur
        if len(result) == k:
            print "cur in kth is {0}".format(cur)
            return cur #cur is printed correctly but not returned
        for i in range(len(char_list)):
            if not used[i]:
                cur.append(char_list[i])
                used[i] = True
                r = self._getPermutation_helper(result, char_list, used, cur, k)
                if r is not None:
                    return r
                # back track
                used[i] = False
                cur.remove(char_list[i])
        
    # O(n) solution if factorial talkes constant time   
    """
    Idea: 
    1) get the index of the element which is selected each time in the recursion
    2) remove that element and add it to result. 
    3) repeat this until n becomes 0
    """
    def getPerm(self, n, k):
        num_arr = map(str,range(1, n + 1))
        k -= 1
        result = ''
        while n:
            n -= 1
            index , k = divmod(k, math.factorial(n))
            result += num_arr.pop(index)
        return result

def main():
    pgm = Solution()
    print pgm.getPermutation(3, 6)
    print pgm.getPerm(3, 6)
if __name__ == "__main__":
    main()