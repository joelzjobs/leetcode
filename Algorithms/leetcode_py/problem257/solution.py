# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        ans = []
        def dfs(node, string):
            if node is None:
                return node
            result = string+"->"+str(node.val) if string else str(node.val)
            if node.left is None and node.right is None:
                ans.append(result)
            else:
                dfs(node.left, result)
                dfs(node.right, result)
                
        dfs(root, "")
        return ans