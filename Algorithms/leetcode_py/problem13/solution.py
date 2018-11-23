class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        hash_map = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }
        
        nums = [hash_map[c] for c in s]
        ans = nums[-1]
        for i in range(1, len(s)):
            if nums[-i-1] < nums[-i] :
                ans -= nums[-1-i]
            else:
                ans += nums[-1-i]
        return ans