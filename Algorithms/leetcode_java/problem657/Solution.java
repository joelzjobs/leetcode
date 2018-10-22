package leetcode_java.problem657;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> record = new HashMap<>();
        
        for(char move : moves.toCharArray()){
            int count = record.getOrDefault(move, 0) + 1;
            record.put(move, count);
        }
        
        return (record.getOrDefault('U', 0).equals(record.getOrDefault('D', 0))) &&
               (record.getOrDefault('L', 0).equals(record.getOrDefault('R', 0)));
    }
}