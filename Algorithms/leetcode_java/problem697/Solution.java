package leetcode_java.problem697;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        Map<Integer, Integer> minIx = new HashMap<>();
        Map<Integer, Integer> maxIx = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(counter.containsKey(num)){
                counter.put(num, counter.get(num)+1);
            }else{
                counter.put(num, 1);
                minIx.put(num, i);
            }
            maxIx.put(num, i);
        }
        int maxFreq = Collections.max(counter.values());
        int ans = nums.length;
        for(int num : counter.keySet()){
            if(counter.get(num) == maxFreq){
                int temp = maxIx.get(num)-minIx.get(num)+1;
                ans = ans < temp ? ans : temp;
            }
        }
        return ans;
    }
}