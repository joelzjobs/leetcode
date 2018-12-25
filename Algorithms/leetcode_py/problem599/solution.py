class Solution:
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        map1 = {res:ix for ix, res in enumerate(list1)}
        common = dict()
        minSum = len(list1) + len(list2)
        for ix, res in enumerate(list2):
            if res in map1:
                common[res] = ix+map1[res]
                minSum = min(minSum, common[res])
        return [res for res, s in common.items() if s==minSum]