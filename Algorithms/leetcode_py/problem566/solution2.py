class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        flatten = []
        for row in nums:
            flatten += row
        return [flatten[i*c : i*c+c] for i in range(r)] if r * c == len(flatten) else nums