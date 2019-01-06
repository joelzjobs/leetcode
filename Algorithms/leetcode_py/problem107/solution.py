# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        def dfs(node, depth):
            if node is None:
                return
            if len(self.ans) > depth:
                self.ans[-1-depth].append(node.val)
            else:
                self.ans = [[node.val]]+self.ans
            dfs(node.left, depth+1)
            dfs(node.right, depth+1)
        
        self.ans = []
        dfs(root, 0)
        return self.ans