class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        buy = float("inf")
        for price in prices:
            if price < buy:
                buy = price
            if price - buy > max_profit:
                max_profit = price - buy
        return max_profit