package leetcode_java.problem671;

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
    private int minVal = Integer.MAX_VALUE;
    private int secVal = Integer.MAX_VALUE;
    private void dfs(TreeNode node){
        if(node==null){ return ; }
        if(node.val < minVal){
            secVal = minVal;
            minVal = node.val;
        }
        if(minVal < node.val && node.val < secVal){
            secVal = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        return secVal < Integer.MAX_VALUE ? secVal : -1;
    }
}