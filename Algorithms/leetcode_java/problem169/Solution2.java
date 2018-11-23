package leetcode_java.problem169;

import java.util.Arrays;

class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}