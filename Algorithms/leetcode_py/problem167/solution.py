class Solution:
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        low, high = 0, len(numbers)-1
        while low < high:
            curSum = numbers[low] + numbers[high]
            if curSum == target:
                return low+1, high+1
            if curSum < target:
                low += 1
            else:
                high -= 1