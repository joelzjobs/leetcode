package leetcode_java.problem448;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> rangeSet = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();
        
        for(int i = 1; i <= nums.length; i++)
            rangeSet.add(i);
        for(int num : nums)
            numSet.add(num);
            
        for(int n : rangeSet)
            if(!numSet.contains(n))
                ans.add(n);
        return ans;
    }
}