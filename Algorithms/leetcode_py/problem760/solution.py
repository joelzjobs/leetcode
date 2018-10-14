class Solution:
    def anagramMappings(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        lookup = { val: i for i, val in enumerate(B)}
        return [lookup[val] for val in A]