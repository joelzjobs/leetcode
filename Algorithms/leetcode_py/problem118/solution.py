class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = []
        for r in range(numRows):
            row = [1] * (r+1)
            for c in range(1, r):
                row[c] = result[r-1][c-1] + result[r-1][c]
            result.append(row)
        return result