class Solution:
    def isOneBitCharacter(self, bits):
        """
        :type bits: List[int]
        :rtype: bool
        """
        pointer = 0
        while pointer < len(bits) - 1:
            pointer += (2 if bits[pointer] else 1)
        return pointer == len(bits) - 1