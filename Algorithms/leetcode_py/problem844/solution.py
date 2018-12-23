class Solution:
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        def get_string(st):
            s = ""
            for c in st:
                if c == "#":
                    s = s[:-1]
                else:
                    s += c
            return s
        return get_string(S) == get_string(T)