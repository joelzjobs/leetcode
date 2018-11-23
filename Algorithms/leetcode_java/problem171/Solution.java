package leetcode_java.problem171;

class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++)
            ans += Math.pow(26, i) * (s.charAt(s.length()-1-i) - 'A' + 1);
        return ans;
    }
}