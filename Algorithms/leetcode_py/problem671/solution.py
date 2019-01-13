# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def findSecondMinimumValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self._min_val = float("inf")
        self._sec_min = float("inf")
        def dfs(node):
            if node is None:
                return node
            if node.val < self._min_val:
                self._min_val, self._sec_min = node.val, self._min_val
            if self._min_val < node.val < self._sec_min:
                self._sec_min = node.val
            dfs(node.left)
            dfs(node.right)
        
        dfs(root)
        return self._sec_min if self._sec_min < float("inf") else -1