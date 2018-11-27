class Solution:
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        width = int(area**0.5)
        while area % width:
            width -= 1;
        return area//width, width