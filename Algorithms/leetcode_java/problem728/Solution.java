package leetcode_java.problem728;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        
        for(int num = left; num <= right; num++){
            boolean flag = true;
            for(char c : Integer.toString(num).toCharArray()){
                if(c == '0' || num % (c - '0') != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){ ans.add(num); }
        }
        return ans;
    }
}