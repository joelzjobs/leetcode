class Solution:
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        g.sort()
        s.sort()
        g_len = len(g) - 1
        c = 0
        for s_i in s:
            if c > g_len:
                break
            if s_i >= g[c]:
                c += 1
        return c