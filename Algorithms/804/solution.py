class Solution:
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        char2morse = {
            'a': '.-', 'b': '-...', 'c': '-.-.', 'd': '-..', 'e': '.', 
            'f': '..-.', 'g': '--.', 'h': '....', 'i': '..', 'j': '.---', 
            'k': '-.-', 'l': '.-..', 'm': '--', 'n': '-.', 'o': '---', 
            'p': '.--.', 'q': '--.-', 'r': '.-.', 's': '...', 't': '-', 
            'u': '..-', 'v': '...-', 'w': '.--', 'x': '-..-', 'y': '-.--', 'z': '--..'
        }
        return len(set(''.join(char2morse[char] for char in word) for word in words))