package leetcode_java.problem598;

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for(int[] op : ops){
            m = m < op[0] ? m : op[0];
            n = n < op[1] ? n : op[1];
        }
        return m*n;
    }
}