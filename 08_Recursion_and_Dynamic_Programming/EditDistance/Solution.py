class Solution(object):
    def minDistance(self, w1, w2):
        """
        :type word1: str
        :type word2: str
        :rtype: int
        """
        # TLE
        # def mind(w1, w2, m, n):
        #     if not m:
        #         return n # insert n characters to match
        #     if not n:
        #         return m # delete m characters
        #     if w1[m-1] == w2[n-1]:
        #         return mind(w1, w2, m-1, n-1)
        #     else:
        #         return 1+min(mind(w1,w2, m, n-1), min(mind(w1,w2, m-1, n), mind(w1,w2,m-1,n-1)))
        # return mind(w1, w2, len(w1), len(w2))
        
        # DP solution
        m = len(w1)
        n = len(w2)
        dp = [[0] * (n+1) for _ in range(m+1)]
        for i in range(m+1):
            for j in range(n+1):
                if i == 0:
                    dp[i][j] = j # insert j characters
                    continue
                if j == 0:
                    dp[i][j] = i # delete i characters
                    continue
                if w1[i-1] == w2[j-1]:
                    dp[i][j] = dp[i-1][j-1]
                else:
                    dp[i][j] = 1+min(dp[i-1][j], min(dp[i][j-1], dp[i-1][j-1]))
        print(dp)
        return dp[m][n]

pgm = Solution()
w1 = "INTENTION"
w2 = "EXECUTION"
print( pgm.minDistance(w1, w2))
