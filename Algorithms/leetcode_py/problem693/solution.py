class Solution:
    def hasAlternatingBits(self, n):
        """
        :type n: int
        :rtype: bool
        """
        s = bin(n)[2:]
        for i in range(0, len(s)-1):
            if s[i] == s[i+1]:
                return False
        return True