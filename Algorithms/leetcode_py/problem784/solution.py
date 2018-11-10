class Solution:
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """
        ans = ['']
        
        for c in S:
            if c.isalpha():
                ans = [t+c.lower() for t in ans] + [t+c.upper() for t in ans]
            else:
                ans = [t+c for t in ans]
        return ans