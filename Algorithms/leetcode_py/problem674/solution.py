class Solution:
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_len = 0
        cur_len = 0
        prev = float("-inf")
        for num in nums:
            if num > prev:
                cur_len += 1
            else:
                max_len = max(cur_len, max_len)
                cur_len = 1
            prev = num
        return max(max_len, cur_len)