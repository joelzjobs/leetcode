package leetcode_java.problem389;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();
        
        for(char c : s.toCharArray())
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        for(char c : t.toCharArray()){
            if(counter.getOrDefault(c, 0) == 0)
                return c;
            counter.put(c, counter.get(c) - 1);
        }
        return 0;
    }
}