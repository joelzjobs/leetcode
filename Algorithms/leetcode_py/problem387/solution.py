class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        counter = {}
        for c in s:
            counter[c] = counter.get(c, 0)+1
        for i, c in enumerate(s):
            if counter[c] == 1:
                return i
        return -1