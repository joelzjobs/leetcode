class Solution:
    def numberOfBoomerangs(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        ans = 0
        for x1, y1 in points:
            counter = {}
            for x2, y2 in points:
                if x1 != x2 or y1 != y2:
                    distance = (x1-x2)**2 + (y1-y2)**2
                    counter[distance] = counter.get(distance, 0)+1
            ans += sum(n*(n-1) for n in counter.values())
        return ans