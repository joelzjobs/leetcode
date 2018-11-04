package leetcode_java.problem136;

import java.util.Set;
import java.util.HashSet;

class Solution1 {
    public int singleNumber(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        
        for(int num : nums){
            if(ans.contains(num)){
                ans.remove(num);
            }else{
                ans.add(num);
            }
        }
        return ans.iterator().next();
    }
}