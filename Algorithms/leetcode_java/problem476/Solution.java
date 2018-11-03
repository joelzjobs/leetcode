package leetcode_java.problem476;

class Solution {
    public int findComplement(int num) {
        return num ^ ((1<<Integer.toString(num, 2).length()) - 1);
    }
}