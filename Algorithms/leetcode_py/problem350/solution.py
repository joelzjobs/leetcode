class Solution:
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        counter = dict()
        ans = []
        for num in nums1:
            counter[num] = counter.get(num, 0) + 1
        for num in nums2:
            if counter.get(num, 0):
                ans.append(num)
                counter[num] -= 1
        return ans