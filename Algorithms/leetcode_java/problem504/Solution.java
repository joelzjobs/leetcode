package leetcode_java.problem504;

class Solution {
    public String convertToBase7(int num) {
        if(num==0){ return "0"; }
        int n = Math.abs(num);
        String res = "";
        while(n>0){
            res = Integer.toString(n%7)+res;
            n /= 7;
        }
        return num > 0? res : "-"+res;
    }
}