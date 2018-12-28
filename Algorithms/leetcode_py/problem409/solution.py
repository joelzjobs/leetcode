class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        counter = dict()
        has_odd = False
        ans = 0
        for c in s:
            counter[c] = counter.get(c, 0)+1
        for n in counter.values():
            if n % 2:
                has_odd = True
            ans += (n // 2) * 2
        return ans+1 if has_odd else ans