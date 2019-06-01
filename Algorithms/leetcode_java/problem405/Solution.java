package leetcode_java.problem405;

class Solution {
    public String toHex(int num) {
        if(num >= 0 && num < 10){
            return Integer.toString(num);
        }
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        while(num != 0){
            res = map[num & 15] + res;
            num >>>= 4;
        }
        return res;
    }
}
