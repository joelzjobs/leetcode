class Solution:
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        counter_s = dict()
        for c in s:
            counter_s[c] = counter_s.get(c, 0) + 1
        for c in t:
            if not counter_s.get(c, 0):
                return c
            counter_s[c] -= 1