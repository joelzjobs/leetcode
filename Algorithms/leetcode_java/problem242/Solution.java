package leetcode_java.problem242;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()){
            int freq = counter.getOrDefault(c, 0);
            if(freq==0){ return false; }
            counter.put(c, freq-1);
        }
        int sum = 0;
        for(int f : counter.values()){
            sum += f;
        }
        return sum==0;
    }
}
