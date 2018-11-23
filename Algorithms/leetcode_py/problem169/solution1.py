class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counter = dict()
        for n in nums:
            counter[n] = counter.get(n, 0) + 1
        return max(counter.keys(), key=lambda n : counter.get(n))
