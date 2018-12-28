package leetcode_java.problem409;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        boolean hasOdd = false;
        int ans = 0;
        for(char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c,0)+1);
        }
        for(int n : counter.values()){
            if(n%2!=0){
                hasOdd = true;
            }
            ans += (n/2)*2;
        }
        return hasOdd ? ans+1 : ans;
    }
}