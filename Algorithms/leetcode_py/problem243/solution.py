class Solution:
    def shortestDistance(self, words, word1, word2):
        """
        :type words: List[str]
        :type word1: str
        :type word2: str
        :rtype: int
        """
        ans = len(words)
        idx = [-1, -1]
        
        for i, word in enumerate(words):
            if word == word1:
                idx[0] = i
            if word == word2:
                idx[1] = i
            if idx[0] != -1 and idx[1] != -1:
                ans = min(ans, abs(idx[1] - idx[0]))
    
        return ans