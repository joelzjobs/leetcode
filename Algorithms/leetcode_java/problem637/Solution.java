package leetcode_java.problem637;

import java.util.List;
import java.util.ArrayList;

/**
 * Definition for a binary tree node.
*  public class TreeNode {
*      int val;
*      TreeNode left;
*      TreeNode right;
*      TreeNode(int x) { val = x; }
*  }
*/

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        List<Integer> cnt = new ArrayList<>();
        getLevelSum(root, 0, res, cnt);
        
        for(int i = 0; i < res.size(); i++){
            res.set(i, res.get(i)/cnt.get(i));
        }
        
        return res;
    }
    
    private void getLevelSum(TreeNode node, int level, List<Double> res, List<Integer> cnt){
        if(node == null){ return; }
        if(res.size() <= level){
            res.add(node.val * 1.0);
            cnt.add(1);
        }else{
            res.set(level, res.get(level) + node.val);
            cnt.set(level, cnt.get(level) + 1);
        }
        getLevelSum(node.left, level+1, res, cnt);
        getLevelSum(node.right, level+1, res, cnt);
    }
}