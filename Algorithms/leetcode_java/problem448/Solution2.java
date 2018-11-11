package leetcode_java.problem448;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int n : nums){
            int i = (n < 0 ? -n : n) - 1;
            nums[i] = nums[i] > 0 ? -nums[i] : nums[i];
        }
        
        for(int i = 0; i < nums.length; i++)
            if(nums[i] > 0)
                ans.add(i+1);
        return ans;
    }
}