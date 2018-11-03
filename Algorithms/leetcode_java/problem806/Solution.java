package leetcode_java.problem806;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] ans = {1, 0};
        for(char c : S.toCharArray()){
            int length = widths[c - 'a'];
            if(ans[1] + length > 100){
                ans[0] += 1;
                ans[1] = length;
            }else{
                ans[1] += length;
            }
        }
        return ans;
    }
}