# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def findTilt(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self._tilt = 0
        self.dfs(root)
        return self._tilt
        
    def dfs(self, node):
        if node is None:
            return 0
        left = self.dfs(node.left)
        right = self.dfs(node.right)
        self._tilt += abs(left-right)
        return left+right+node.val