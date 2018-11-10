class Solution:
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        return word == word.lower() or word == word.upper() or word == word.capitalize()