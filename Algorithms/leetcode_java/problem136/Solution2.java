package leetcode_java.problem136;

import java.util.Set;
import java.util.HashSet;

class Solution2 {
    public int singleNumber(int[] nums) {
        int sum = 0;
        int set_sum = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
            sum += num;
        }
        
        for(int num : set){
            set_sum += num;
        }
        
        return 2 * set_sum - sum;
    }
}