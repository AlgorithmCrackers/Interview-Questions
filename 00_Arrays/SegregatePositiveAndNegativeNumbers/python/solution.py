arr = [4, -1, 1, -5, 2, -6, 3]

high = len(arr) - 1
low = 0

def swap(i, j):
	arr[i], arr[j] = arr[j], arr[i]
	
index = 0
while(index <= high):
	if arr[index] > 0:
		swap(index, low)
		low += 1
	index += 1

print arr
