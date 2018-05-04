"""
Given the mobile numeric keypad. You can only press buttons that are up, left, right or down to the current button. 
You are not allowed to press bottom row corner buttons (i.e. * and # )
Given a number N, find out the number of possible numbers of given length. 

https://www.geeksforgeeks.org/mobile-numeric-keypad-problem/

"""


def count(N):
    # format the keypad as adj list
    adj = [
        [8],
        [2,4],
        [1,5,3],
        [2,6],
        [1,5,7],
        [2,4,6,8],
        [3,5,9],
        [4,8],
        [5,7,9,0],
        [6,8]
    ]
    K = 10
    dp = [ [0]*K for _ in range(N+1)]

    # base case
    for j in range(K):
        dp[1][j] = 1
    # print("value of ", 1, " = ", sum(dp[1]))

    # iterative approach
    for i in range(2,N+1):
        for j in range(K):
            dp[i][j] = dp[i-1][j]
            for v in adj[j]:
                dp[i][j] += dp[i-1][v]
        # print("value of ", i, " = ", sum(dp[i]))
    return sum(dp[-1])

if __name__ == "__main__":
    print(count(10))
