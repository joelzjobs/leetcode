class Solution:
    def tree2str(self, t):
        """
        :type t: TreeNode
        :rtype: str
        """
        if t is None:
            return ''
        if t.left is None and t.right is None:
            return str(t.val)
        if t.right is None:
            return str(t.val) + '({})'.format(self.tree2str(t.left))
        return str(t.val) + '({})({})'.format(self.tree2str(t.left), self.tree2str(t.right))