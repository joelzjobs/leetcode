package leetcode_java.problem107;

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
    private List<List<Integer>> ans = new ArrayList<>();
    private void dfs(TreeNode node, int depth){
        if(node==null){ return ; }
        if(ans.size() > depth){ ans.get(ans.size()-1-depth).add(node.val); }
        else{ 
            List<Integer> temp = new ArrayList<>();
            temp.add(node.val);
            ans.add(0, temp);
        }
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
}