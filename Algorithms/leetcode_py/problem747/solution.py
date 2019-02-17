class Solution(object):
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_val = 0
        sec_max = 0
        idx = -1
        for i, num in enumerate(nums):
            if num > max_val:
                idx, max_val, sec_max = i, num, max_val
            elif num > sec_max:
                sec_max = num
        return idx if max_val >= sec_max*2 else -1