package leetcode_java.problem293;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> ans = new ArrayList<>();
        
        for(int i = 1; i < s.length(); i++){
            if(s.substring(i-1, i+1).equals("++")){
                ans.add(s.substring(0,i-1)+"--"+s.substring(i+1));
            }
        }
        return ans;
    }
}
