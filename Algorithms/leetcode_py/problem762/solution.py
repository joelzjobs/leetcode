class Solution:
    def countPrimeSetBits(self, L, R):
        """
        :type L: int
        :type R: int
        :rtype: int
        """
        prime_set = {2, 3, 5, 7, 11, 13, 17, 19}
        return sum(bin(n).count('1') in prime_set for n in range(L, R+1))
