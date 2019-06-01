class Solution(object):
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counter = dict()
        res = 0
        for num in nums:
            counter[num] = counter.get(num, 0)+1
        for key, val in counter.items():
            if key+1 in counter:
                res = max(res, counter[key+1]+val)  
        return res