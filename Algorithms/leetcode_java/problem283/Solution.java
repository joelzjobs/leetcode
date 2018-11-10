package leetcode_java.problem283;

class Solution {
    public void moveZeroes(int[] nums) {
        int point = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[point] != 0)
                point ++;
            else if(nums[i] != 0){
                nums[point] = nums[i];
                nums[i] = 0;
                point ++;
            }
        }
    }
}