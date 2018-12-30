package leetcode_java.problem628;

import java.util.Arrays;

class Solution1 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sum1 = nums[0]*nums[1];
        int sum2 = nums[nums.length-2]*nums[nums.length-3];
        return nums[nums.length-1]*(sum1 > sum2 ? sum1 : sum2);
    }
}