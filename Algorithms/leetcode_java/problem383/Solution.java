package leetcode_java.problem383;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char c : magazine.toCharArray()){
            counter.put(c, counter.getOrDefault(c, 0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            int freq = counter.getOrDefault(c, 0);
            if(freq==0){ return false; }
            counter.put(c, freq-1);
        }
        return true;
    }
}
