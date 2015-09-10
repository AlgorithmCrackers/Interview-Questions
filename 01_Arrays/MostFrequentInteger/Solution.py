import unittest

# time O(n)
# space O(n)
class Solution(object):
	def getMostFreqInteger(self, arr):
		if len(arr) is 1:
			return arr[0]
		dic = {}
		for i in range(len(arr)):
			if arr[i] in dic:
				dic[arr[i]] += 1
			else:
				dic[arr[i]] = 1
		max_count = 0
		max_item = ''
		for k, v in dic.items():
			if(max_count < v):
				max_count = v
				max_item = k
		return max_item

	"""
	Constraint: element in array can range from 0 to k-1, k <= n
	"""
	def getMostFreqInteger_2(self, arr):
		if len(arr) == 0:
			return ''
		if len(arr) == 1:
			return arr[0]
		k = len(arr)
		return self._helper(arr, len(arr), k)

	def _helper(self, arr, n, k):
		for i in range(n):
			arr[ arr[i] % k] += k
		maxnum = arr[0]
		result = ''	# index specifies the maximum element uptained
		for i in range(1, n):
			if arr[i] > maxnum:
				maxnum = arr[i]
				result = i
		return result

# unittesting
class TestMostFrequentInteger(unittest.TestCase):
	def test_few_elements(self):
		self.assertEqual(Solution().getMostFreqInteger([2, 1, 3, 1, 4, 4, 4]), 4)
		self.assertEqual(Solution().getMostFreqInteger_2([2, 1, 3, 1, 4, 4, 4]), 4)

	def test_one_element(self):
		self.assertEqual(Solution().getMostFreqInteger([1]), 1)
		self.assertEqual(Solution().getMostFreqInteger_2([1]), 1)

	def test_no_element(self):
		self.assertEqual(Solution().getMostFreqInteger([]), '')
		self.assertEqual(Solution().getMostFreqInteger_2([]), '')

def main():
	unittest.main()
	# print Solution().getMostFreqInteger([])

if __name__ == '__main__':
	main()