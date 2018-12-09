class Solution:
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        counter = dict()
        for c in magazine:
            counter[c] = counter.get(c, 0)+1
        for c in ransomNote:
            if not counter.get(c, 0):
                return False
            counter[c] -= 1
        return True