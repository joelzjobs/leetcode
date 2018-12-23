package leetcode_java.problem563;



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
    private int tilt;
    private int dfs(TreeNode node){
        if(node == null){ return 0; }
        int left = dfs(node.left);
        int right = dfs(node.right);
        tilt += Math.abs(left-right);
        return left+right+node.val;
    }
    public int findTilt(TreeNode root) {
        tilt = 0;
        dfs(root);
        return tilt;
    }
}