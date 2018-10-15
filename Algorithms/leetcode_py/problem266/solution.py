class Solution:
    def canPermutePalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        left = set()
        for c in s:
            if c in left:
                left.remove(c)
            else:
                left.add(c)
        return len(left) < 2