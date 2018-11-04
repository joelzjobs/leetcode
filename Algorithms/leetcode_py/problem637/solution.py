# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        res = []
        cnt = []
        
        def getLevelSum(node, level):
            if len(res) <= level:
                res.append(node.val)
                cnt.append(1)
            else:
                res[level] += node.val
                cnt[level] += 1
            if node.left:
                getLevelSum(node.left, level+1)
            if node.right:
                getLevelSum(node.right, level+1)
                
        getLevelSum(root, 0)
        return [s/c for s, c in zip(res, cnt)]