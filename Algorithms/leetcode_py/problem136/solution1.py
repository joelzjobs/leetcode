class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = set()
        for num in nums:
            if num in ans:
                ans.remove(num)
            else:
                ans.add(num)
        return ans.pop()