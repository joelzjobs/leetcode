class Solution:
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        for i in range(len(s)):
            ans += (ord(s[-i-1]) - ord('A') + 1) * (26 ** i)
        return ans