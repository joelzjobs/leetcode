class Solution:
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if not num:
            return str(num)
        n = abs(num)
        res = ""
        while n:
            res = str(n%7)+res
            n = n//7
        return res if num > 0 else "-"+res