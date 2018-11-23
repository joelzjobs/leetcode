package leetcode_java.problem169;

import java.util.Map;
import java.util.HashMap;

class Solution1 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int n : nums){ counter.put(n, counter.getOrDefault(n,0)+1); }
        
        int ans = 0;
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            int n = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                ans = n;
                maxFreq = freq;
            }
        }
        return ans;
    }
}