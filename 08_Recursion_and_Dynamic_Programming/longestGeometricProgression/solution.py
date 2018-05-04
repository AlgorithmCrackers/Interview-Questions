A = [3, 9, 27, 81]
n = len(A)
dp = [1]*n
for i in range(1, n):
	for j in range(i):
		if A[i] % A[j] == 0:
			dp[i] = max(dp[i], dp[j]+1)
print("count:",max(dp))
