class Solution:
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        l2, l1 = 0, 0
        for c in cost:
            l2, l1 = l1, min(l2, l1)+c
        return min(l2, l1)