package leetcode_java.problem387;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            if(counter.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}