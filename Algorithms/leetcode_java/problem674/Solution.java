package leetcode_java.problem674;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        int curLen = 0;
        int prev = 0;
        for(int num : nums){
            if(num > prev){
                curLen ++;
            }else{
                maxLen = maxLen > curLen ? maxLen : curLen;
                curLen = 1;
            }
            prev = num;
        }
        return maxLen > curLen ? maxLen : curLen;
    }
}