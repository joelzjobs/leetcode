# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def closestValue(self, root, target):
        """
        :type root: TreeNode
        :type target: float
        :rtype: int
        """
        self._ans = root.val
        self._target = target
        
        def compare(node):
            if node is None:
                return
            if abs(node.val-self._target) < abs(self._ans-self._target):
                self._ans = node.val
            compare(node.left)
            compare(node.right)
        compare(root)
        return self._ans