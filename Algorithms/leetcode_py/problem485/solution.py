class Solution:
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        n = 0
        for num in nums:
            if num == 1:
                n += 1
            else:
                ans = max(n, ans)
                n = 0
                
        return max(n, ans)