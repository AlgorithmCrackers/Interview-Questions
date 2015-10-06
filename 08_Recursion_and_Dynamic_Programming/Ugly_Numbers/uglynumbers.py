__author__ = "Prakash Natarajan"

"""
Here is a time efficient solution with O(n) extra space. The ugly-number sequence is 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
     because every number can only be divided by 2, 3, 5, one way to look at the sequence is to split the sequence to three groups as below:
     (1) 1×2, 2×2, 3×2, 4×2, 5×2, …
     (2) 1×3, 2×3, 3×3, 4×3, 5×3, …
     (3) 1×5, 2×5, 3×5, 4×5, 5×5, …

     We can find that every subsequence is the ugly-sequence itself (1, 2, 3, 4, 5, …) multiply 2, 3, 5. Then we use similar merge method as merge sort, to get every ugly number from the three subsequence. Every step we choose the smallest one, and move one step after.
source: http://www.geeksforgeeks.org/ugly-numbers/
"""
def getUglyNumber(n):
	# @input n int
	# @output int nth ugly number
	ugly = [0] * (n)
	count = 1
	ugly[0] = 1
	i2 = i3 = i5 = 0
	multiple_of_2 = 2 
	multiple_of_3 = 3 
	multiple_of_5 = 5 
	while(count < n):
		# output n-1
		next_number = min(multiple_of_2, 
			multiple_of_3,
			multiple_of_5)
		if next_number == multiple_of_2:
			i2 += 1
			ugly[count] = next_number
			multiple_of_2 = ugly[i2] * 2
			# count +=1
		elif next_number == multiple_of_3 :
			i3 += 1
			multiple_of_3 = ugly[i3] * 3
			if next_number in ugly:
				continue
			ugly[count] = next_number
		elif next_number == multiple_of_5 :
			i5 += 1
			multiple_of_5 = ugly[i5] * 5
			if next_number in ugly:
				continue
			ugly[count] = next_number
		count += 1
	print ugly
	print len(ugly)
	return ugly[n-1]

if __name__ == '__main__':
	print getUglyNumber(150)
