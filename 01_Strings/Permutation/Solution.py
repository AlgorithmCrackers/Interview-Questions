class Solution(object):
	def permute(self, nums):
		result = []
		used = [False] * len(nums)
		self.permuteRec(result, used, [], nums)
		return result

	"""
	 result is array which is place holder all the permutations
	 used is boolean array for indication which char is used till now
	 cur holds the cur characters in the permutation
	 nums is the initial array given by the use
	"""

	def permuteRec(self, result, used, cur, nums):
		# if cur contains all nums then add to result
		if len(cur) == len(nums):
			result.append(cur + [])
			return
		for i in range(len(nums)):
			if not used[i]:
				used[i] = True
				cur.append(nums[i])
				self.permuteRec(result, used, cur, nums)
				#back track
				# if we dont revert these things back we wont be going into the next recution
				cur.pop()
				used[i] = False

#/* 
# Imported from 
# http://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html

class Permutation(object):
	# prefix hold the formed permutation string
	# str is the input string
	def run(self, str):
		result = []
		self.permute("", str, result)
		return result

	def permute(self, prefix, str, result):
		n = len(str)
		if n == 0:
			# print prefix
			result.append(prefix)
		for i in range(n):
			# for each recurtion remove the corresponding char
			self.permute(prefix + str[i], str[0:i] + str[i+1:n], result)

# Permutations already exist in itertools library
# from itertools import permutations

def main():
	pgm = Solution()
	p = pgm.permute
	print p(list('ABC'))

	print 'testing with permutation class'
	pgm2 = Permutation()
	# pgm2.permute("", "ABC")
	print pgm2.run("ABC")


if __name__ == '__main__':
	main()