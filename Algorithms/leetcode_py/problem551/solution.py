class Solution:
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """
        has_absent=False
        for i, c in enumerate(s):
            if c == 'A':
                if has_absent:
                    return False
                has_absent=True
            if i>1 and c=='L' and s[i-1]=='L' and s[i-2]=='L':
                return False
        return True