package leetcode_java.problem404;

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
    private int dfs(TreeNode node, boolean isLeft){
        if(node == null){ return 0; }
        if(node.left == null && node.right == null){
            if(isLeft){ return node.val; }
            return 0;
        }
        return dfs(node.left, true) + dfs(node.right, false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
}