class Solution(object):
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
        char_list = range(1, n + 1)
        used = [False] * len(char_list)
        result = []
        self._getPermutation_helper(result, char_list, used, [], k)
        # print ''.join[map(str, x) for x in result[k-1]]
        return "".join(str(x) for x in result[k - 1])

    def _getPermutation_helper(self, result, char_list, used, cur,  k):
        if len(char_list) == len(cur):
            result.append(cur + [])
        for i in range(len(char_list)):
            if not used[i]:
                cur.append(char_list[i])
                used[i] = True
                self._getPermutation_helper(result, char_list, used, cur, k)
                # back track
                used[i] = False
                cur.remove(char_list[i])


        
    def permutation(self, char_list):
        used = [False] * len(char_list)
        print used
        result = []
        self._permutation_helper(result, char_list, used, [])
        print result

    def _permutation_helper(self, result, char_list, used, cur):
        if len(cur) == len(char_list):
            result.append(cur + [])
        for i in range(len(char_list)):
            if not used[i]:
                cur.append(char_list[i])
                used[i] = True
                self._permutation_helper(result, char_list, used, cur)
                # back track
                used[i] = False
                cur.remove(char_list[i])

def main():
    pgm = Solution()
    # pgm.permutation([1, 2, 3])
    print pgm.getPermutation(3, 6)
if __name__ == "__main__":
    main()