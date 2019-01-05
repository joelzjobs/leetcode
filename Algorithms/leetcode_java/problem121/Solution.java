package leetcode_java.problem121;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < buy){ buy = price; }
            if(price - buy > maxProfit){ maxProfit = price - buy;}
        }
        return maxProfit;
    }
}