package leetcode_java.problem371;

class Solution {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b)<<1;
        while(carry != 0){
            int m = sum;
            int n = carry;
            sum = m ^ n;
            carry = (m & n)<<1;
        }
        return sum;
    }
}