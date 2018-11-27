package leetcode_java.problem453;

class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int num : nums){
            sum += num;
            min = num < min ? num : min;
        }
        return sum - min * nums.length;
    }
}
