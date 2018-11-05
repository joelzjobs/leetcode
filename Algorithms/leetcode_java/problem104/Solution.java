package leetcode_java.problem104;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){ return 0; }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }
}