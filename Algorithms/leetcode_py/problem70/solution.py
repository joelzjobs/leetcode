class Solution:
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 3:
            return n
        first, second = 1, 2
        for _ in range(3, n+1):
            first, second = second, first + second
        return second