package leetcode_java.problem344;

class Solution1 {
    public String reverseString(String s) {
        char[] ns = s.toCharArray();
        int i = 0;
        int j = ns.length - 1;
        
        while(i < j){
            char t = ns[i];
            ns[i] = ns[j];
            ns[j] = t;
            i ++;
            j --;
        }
        
        return new String(ns);
    }
}