class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        lines = [set('qwertyuiop'), set('asdfghjkl'), set('zxcvbnm')]
        ans = []
        for word in words:
            tmp = set(word.lower())
            if tmp.issubset(lines[0]) or tmp.issubset(lines[1]) or tmp.issubset(lines[2]):
                ans.append(word)
        return ans