package leetcode_java.problem455;


import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g_len = g.length - 1;
        int c = 0;
        for(int s_i : s){
            if(c > g_len){ break; }
            if(s_i >= g[c]){ c++; }
        }
        return c;
    }
}