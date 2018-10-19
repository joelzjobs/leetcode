package leetcode_java.problem804;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> codes = new HashSet<>();
        
        for(String word : words){
            String code = "";
            for(char ch : word.toCharArray()) { code += morse[ch - 'a']; }
            codes.add(code);
        }
        
        return codes.size();
    }
}