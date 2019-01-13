package leetcode_java.problem257;

import java.util.List;
import java.util.ArrayList;

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
    private List<String> ans = new ArrayList<>();
    
    private void dfs(TreeNode node, String str){
        if(node == null){ return ; }
        String result = str.equals("") ? Integer.toString(node.val) : str+"->"+Integer.toString(node.val);
        if(node.left==null && node.right==null){ 
            ans.add(result); }else{
            dfs(node.left, result);
            dfs(node.right, result);
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return ans;
    }
}