class Solution:
    def findShortestSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counter = dict()
        min_ix = dict()
        max_ix = dict()
        for ix, num in enumerate(nums):
            if num in counter:
                counter[num] += 1
            else:
                counter[num] = 1
                min_ix[num] = ix
            max_ix[num] = ix
        max_freq = max(counter.values())
        return min(max_ix[num]-min_ix[num]+1 for num, freq in counter.items() if freq==max_freq)