class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        counter = dict()
        for c in s:
            counter[c] = counter.get(c, 0) + 1
        for c in t:
            if not counter.get(c, 0):
                return False
            counter[c] -= 1
        return sum(counter.values()) == 0