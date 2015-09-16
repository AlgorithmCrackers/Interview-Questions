class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        < = k
        """
        if len(nums) == 1:
            return False
        hm = {} # key element value index
        for i in range(len(nums)):
            if not nums[i] in hm:
                #new element
                hm[nums[i]] = i
            else:
                prev_index = hm[nums[i]]
                if i - prev_index <= k:
                    return True
                else:
                    hm[nums[i]] = i
        return False
            
        
        