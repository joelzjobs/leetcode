class Solution:
    def largeGroupPositions(self, S):
        """
        :type S: str
        :rtype: List[List[int]]
        """
        start = 0
        end = 0
        ans = []
        for i in range(1, len(S)):
            if S[i] == S[i-1]:
                end = i
            else:
                if end - start >= 2:
                    ans.append([start, end])
                start = i
        if end - start >= 2:
                    ans.append([start, end])
        return ans