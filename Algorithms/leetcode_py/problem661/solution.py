class Solution:
    def imageSmoother(self, M):
        """
        :type M: List[List[int]]
        :rtype: List[List[int]]
        """
        m, n = len(M), len(M[0])
        result = [[0]*n for _ in range(m)]
        
        for r in range(m):
            for c in range(n):
                count = 0
                for i in range(r-1, r+2):
                    for j in range(c-1, c+2):
                        if 0<=i<m and 0<=j<n:
                            result[r][c] += M[i][j]
                            count +=1
                result[r][c] = result[r][c]//count
        return result