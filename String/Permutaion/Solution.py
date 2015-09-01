class Solution(object):
	def permute(self, nums):
		result = []
		used = [False] * len(nums)
		self.permuteRec(result, used, [], nums)
		return result

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
				cur.pop()
				used[i] = False

# from itertools import permutations

# def swap(str, index1, index2):
# 	new = list(str)
# 	temp = new[index1]
# 	new[index1] = new[index2]
# 	new[index2] = temp
# 	return ''.join(new)

def main():
	pgm = Solution()
	p = pgm.permute
	print p(list('ABC'))


if __name__ == '__main__':
	main()