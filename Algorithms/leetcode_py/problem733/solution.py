class Solution:
    def floodFill(self, image, sr, sc, newColor):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type newColor: int
        :rtype: List[List[int]]
        """
        def dfs(r, c, color, newColor):
            if image[r][c] == color:
                image[r][c] = newColor
                if r-1 >= 0:
                    dfs(r-1, c, color, newColor)
                if r+1 < len(image):
                    dfs(r+1, c, color, newColor)
                if c-1 >= 0:
                    dfs(r, c-1, color, newColor)
                if c+1 < len(image[0]):
                    dfs(r, c+1, color, newColor)
    
        color = image[sr][sc]
        if color == newColor:
            return image
        dfs(sr, sc, color, newColor)
        return image