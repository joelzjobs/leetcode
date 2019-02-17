package leetcode_java.problem270;


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
    private int ans;
    private void compare(TreeNode node, double target){
        if(node == null){return ;}
        if(Math.abs(node.val-target)<Math.abs(ans-target)){
            ans = node.val;
        }
        compare(node.left, target);
        compare(node.right, target);
    }
    public int closestValue(TreeNode root, double target) {
        ans = root.val;
        compare(root, target);
        return ans;
    }
}