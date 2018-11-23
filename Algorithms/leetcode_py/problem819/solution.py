class Solution:
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        banset = set(banned)
        words = re.split("[!?',;.\\s]+", paragraph.lower())
        counter = dict()
        for word in words:
            if word and word not in banset:
                counter[word] = counter.get(word, 0) + 1
        return max(counter.items(), key=lambda d: d[-1])[0]