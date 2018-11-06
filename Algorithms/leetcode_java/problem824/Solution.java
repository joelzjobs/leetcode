package leetcode_java.problem824;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder ans = new StringBuilder();
        String tail = "";
        
        for(String word : S.split(" ")){
            if(vowels.contains(word.charAt(0))){
                ans.append(word);
            }else{
                ans.append(word.substring(1) + word.substring(0, 1));
            }
            ans.append("ma");
            tail += "a";
            ans.append(tail + " ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}