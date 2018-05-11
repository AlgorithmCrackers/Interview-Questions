a = ['a','b','c','d']
def subset(arr, cur, res, ind):
	# print(cur, ind)
	if ind > len(arr):
		return
	if ind == len(arr):
		test = list(cur)
		res.append(test)
		return
	subset(arr, cur, res, ind+1)
	cur.append(arr[ind])
	subset(arr, cur, res, ind+1)
	cur.pop()
	
res = []
subset(a, [], res, 0)
print(res)
print(len(res))
