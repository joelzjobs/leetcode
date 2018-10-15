package leetcode_java.problem266;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> left = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(left.contains(s.charAt(i))){
                left.remove(s.charAt(i));
            }else {
                left.add(s.charAt(i));
            }
        }
        
        return left.size() < 2;
    }
}