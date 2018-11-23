package leetcode_java.problem13;

import java.util.Map;
import java.util.HashMap;


class Solution {
    public int romanToInt(String s) {
        char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] vals = {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < vals.length; i++){ hashMap.put(chars[i], vals[i]); }
        
        int i = 0;
        int[] nums = new int[s.length()];
        for(char c : s.toCharArray()){
            nums[i++] = hashMap.get(c);
        }
        
        int ans = nums[s.length() - 1];
        int l = s.length();
        
        for(i = 1; i < l; i++){
            if(nums[l-i-1] < nums[l-i]){
                ans -= nums[l-1-i];
            }else{
                ans += nums[l-1-i];
            }
        }
        
        return ans;
    }
}