package leetcode_java.problem500;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        Set<Character> line0 = stringToSet("qwertyuiop");
        Set<Character> line1 = stringToSet("asdfghjkl");
        Set<Character> line2 = stringToSet("zxcvbnm");
        ArrayList<String> ans = new ArrayList<>();
        
        for(String word : words){
            Set<Character> temp = stringToSet(word.toLowerCase());
            if(line0.containsAll(temp) || line1.containsAll(temp) || line2.containsAll(temp)){
                ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
    
    public Set<Character> stringToSet(String word){
        Set<Character> res = new HashSet<>();
        for(char c : word.toCharArray()){
            res.add(c);
        }
        return res;
    }
}