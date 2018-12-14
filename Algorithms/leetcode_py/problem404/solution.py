# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node, is_left):
            if not node:
                return 0
            if not node.left and not node.right:
                if is_left:
                    return node.val
                return 0
            return dfs(node.left, True) + dfs(node.right, False)
        
        return dfs(root, False)