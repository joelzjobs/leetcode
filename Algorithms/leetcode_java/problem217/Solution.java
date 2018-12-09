package leetcode_java.problem217;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            if(numsSet.contains(num)){
                return true;
            }
            numsSet.add(num);
        }
        return false;
    }
}