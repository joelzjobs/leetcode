class Solution:
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        lst = list(s)
        for s in range(0, len(s), 2*k):
            lst[s:s+k] = lst[s:s+k][::-1]
        return "".join(lst)