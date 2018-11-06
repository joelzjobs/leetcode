package leetcode_java.problem485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int n = 0;
        for(int num : nums){
            if(num == 1){
                n ++;
            }else{
                ans = ans > n ? ans : n;
                n = 0;
            }
        }
        return ans > n ? ans : n;
    }
}