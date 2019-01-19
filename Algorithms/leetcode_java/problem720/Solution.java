package leetcode_java.problem720;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public String longestWord(String[] words) {
        Set<String> valid = new HashSet<>();
        Arrays.sort(words);
        for(String word : words){
            if(word.length()<2 || valid.contains(word.substring(0, word.length()-1))){
                valid.add(word);
            }
        }
        String[] validArr = new String[valid.size()];
        validArr = valid.toArray(validArr);
        Arrays.sort(validArr);
        int maxLen = 0;
        for(String word : validArr){
            int curLen = word.length();
            maxLen = curLen > maxLen ? curLen : maxLen;
        }
        for(String word : validArr){
            System.out.println(word);
            if(word.length()==maxLen){
                return word;
            }
        }
        return "";
    }
}