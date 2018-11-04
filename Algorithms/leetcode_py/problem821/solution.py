class Solution:
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        ans = [float('inf')]
        for i, char in enumerate(S):
            curDist = 0 if char == C else ans[i] + 1
            ans.append(curDist)
        temp = float('inf')
        for i, char in enumerate(S[::-1]):
            temp = 0 if char == C else temp + 1
            ans[-1-i] = min(ans[-1-i], temp)
        return ans[1:]