# your code goes here
import sys
def findTheTwoSmallest(arr):
	l = len(arr)
	if l <= 2:
		return arr
	second = first = sys.maxint
	for i in range(l):
		if arr[i] < first:
			second = first
			first = arr[i]
		elif arr[i] < second:
			second = arr[i]
	return first, second

def findTheTwoSmallestIndex(arr):
	l = len(arr)
	if l <= 2:
		return arr
	second = first = 0
	for i in range(1, l):
		if arr[i] < arr[first]:
			second = first
			first = i
		elif arr[i] < arr[second]:
			second = i
	return first, second
	
	
	
print findTheTwoSmallest([1, 2, 3, 4, 5, 0])
print findTheTwoSmallestIndex([1, 2, 3, 4, 5, 0])
