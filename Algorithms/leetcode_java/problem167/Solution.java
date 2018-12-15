package leetcode_java.problem167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            int curSum = numbers[low] + numbers[high];
            if(curSum == target){
                ans[0] = low+1;
                ans[1] = high+1;
                break;
            }
            if(curSum < target){
                low ++;
            }else{
                high --;
            }
        }
        return ans;
    }
}