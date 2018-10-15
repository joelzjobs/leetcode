package leetcode_java.problem771;

import java.util.Set;
import java.util.HashSet;

class Solution2 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet<>();
        
        for(int j = 0; j < J.length(); j++)
            Jset.add(J.charAt(j));
        
        int ans = 0;
        
        for(int i = 0; i < S.length(); i++)
            if(Jset.contains(S.charAt(i)))
                ans ++;
        return ans;
    }
}
