class Solution:
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """
        def process(word, idx):
            if word[0] not in 'aeiouAEIOU':
                word = word[1:] + word[0]
            return word + "ma" + "a" * (idx+1)
        
        return " ".join(process(word, idx) for idx, word in enumerate(S.split()))