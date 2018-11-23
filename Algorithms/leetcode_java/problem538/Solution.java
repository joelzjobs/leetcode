package leetcode_java.problem538;

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
    private int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        if(root == null){ return root; }
        convertBST(root.right);
        this.sum += root.val;
        root.val = this.sum;
        convertBST(root.left);
        return root;
    }
}