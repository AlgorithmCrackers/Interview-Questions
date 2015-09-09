import math 

class Solution(object):

    # Time complexity O(2 ^ n)
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        """
        Constraints : 1 <= n <= 9
        k can be anything
        
        Idea:
        1) recursive for permutation.
        2) when the recursion count reaches k return the current computed permutation
        """
        char_list = map(str, range(1, n + 1)) #convert to strin
        used = [False] * len(char_list)
        result = []
        kthArray = self._getPermutation_helper(result, char_list, used, [], k)
        print kthArray
        # return "".join(str(x) for x in result[k - 1])

    def _getPermutation_helper(self, result, char_list, used, cur,  k):
        if len(char_list) == len(cur):
            result.append(cur + [])
            print len(result)
            print cur
        if len(result) == k:
            print "cur in kth is {0}".format(cur)
            return cur
        for i in range(len(char_list)):
            if not used[i]:
                cur.append(char_list[i])
                used[i] = True
                self._getPermutation_helper(result, char_list, used, cur, k)
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
        print result

def main():
    pgm = Solution()
    pgm.getPerm(2, 1)
if __name__ == "__main__":
    main()