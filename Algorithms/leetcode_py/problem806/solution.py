class Solution:
    def numberOfLines(self, widths, S):
        """
        :type widths: List[int]
        :type S: str
        :rtype: List[int]
        """
        ans = [1, 0]
        for c in S:
            num = widths[ord(c) - ord("a")]
            if ans[1] + num > 100:
                ans[0] += 1
                ans[1] = num
            else:
                ans[1] += num
        return ans